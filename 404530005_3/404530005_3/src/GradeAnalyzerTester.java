/*
 * [A]93
 * [TA's Advise]
 * 1. 建議先不要省略{}, 等你們觀念更好的時候再去省略, 不然會出現容易一些致命的錯誤喔!
 * 2. 標準差公式似乎寫錯了, 請注意.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputnumber = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		// 迴圈內容裡面寫錯了, 為了你們的概念, 建議先不要省略{}, 請跟你原始檔案比較, -5
		while (true) {
			inputnumber = JOptionPane.showInputDialog(null, "Please enter one score");

			// equalsIgnoreCase是不管大小寫的比較, 所以寫一個就可以了喔
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
