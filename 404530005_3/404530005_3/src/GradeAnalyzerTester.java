/*
 * [A]93
 * [TA's Advise]
 * 1. ��ĳ�����n�ٲ�{}, ���A���[����n���ɭԦA�h�ٲ�, ���M�|�X�{�e���@�ǭP�R�����~��!
 * 2. �зǮt�������G�g���F, �Ъ`�N.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputnumber = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		// �j�餺�e�̭��g���F, ���F�A�̪�����, ��ĳ�����n�ٲ�{}, �и�A��l�ɮפ��, -5
		while (true) {
			inputnumber = JOptionPane.showInputDialog(null, "Please enter one score");

			// equalsIgnoreCase�O���ޤj�p�g�����, �ҥH�g�@�ӴN�i�H�F��
			if (inputnumber.equalsIgnoreCase("Q") || inputnumber.equalsIgnoreCase("q"))
				break;

			else {
				// GA.addGrade(Double.parseDouble(inputnumber));
				try {
					GA.addGrade(Double.parseDouble(inputnumber));
				} catch (Exception e) {
					System.out.println("Please input valid number");
				}
			}
		}
		if (GA.validgrade < 2) {
			System.out.println("You did not enter enough grades to analyze \nPlease enter at least 2 valid grades");
		} else {
			GA.analyzeGrades();
			System.out
					.println("You entered" + GA.validgrade + "valid grades from 0 to 110. Invalid grades are ignored!");
			System.out.println("The average =" + GA.average + "with a standard deviation =" + GA.standard_deviation);
			System.out.println(GA);
		}
	}
}
