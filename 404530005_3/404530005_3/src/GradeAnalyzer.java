import java.util.ArrayList;

class output {
	String level;
	int inputscore;

	output() {
	}

	output(String Lavel, int Inputscore) {
		this.level = Lavel;
		this.inputscore = Inputscore;
	}

	public String toString() {
		return this.level + "=" + this.inputscore;
	}
}

public class GradeAnalyzer {
	ArrayList<Double> score = new ArrayList<Double>();
	output[] counter = new output[11];
	boolean check = true;
	int validgrade = 0;
	double total = 0, average = 0;
	double standard_deviation = 0, x = 0, y = 0;

	static boolean isValidGrade(double aGrade) {
		if (aGrade >= 0 || aGrade <= 100)// Judge the grade value should be in
											// 0~110
			return true;
		else
			return false;
	}

	void addGrade(double aGrade) {

		// Good, +2
		if (check == true) // judge its level is at which one
		{
			counter[0] = new output("A+", 0);
			counter[1] = new output("A", 0);
			counter[2] = new output("A-", 0);
			counter[3] = new output("B+", 0);
			counter[4] = new output("B", 0);
			counter[5] = new output("B-", 0);
			counter[6] = new output("C+", 0);
			counter[7] = new output("C", 0);
			counter[8] = new output("C-", 0);
			counter[9] = new output("D", 0);
			counter[10] = new output("F", 0);
			check = false;
		}
		if (isValidGrade(aGrade)) {
			return;
		}
		validgrade++;// count the number of the input valid score
		total += aGrade;// count the total value of the input valid score
		score.add(aGrade);// put the score into

		if (aGrade >= 90) {
			if (aGrade >= 98)
				counter[0].inputscore++;// A+
			else if (aGrade >= 92)
				counter[1].inputscore++;// A
			else
				counter[2].inputscore++;// A-
		}

		else if (aGrade >= 80) {
			if (aGrade >= 88)
				counter[3].inputscore++;// B+
			else if (aGrade >= 82)
				counter[4].inputscore++;// B
			else
				counter[5].inputscore++;// B-
		}

		else if (aGrade >= 70) {
			if (aGrade >= 78)
				counter[6].inputscore++;// C+
			else if (aGrade >= 72)
				counter[7].inputscore++;// C
			else
				counter[8].inputscore++;// C-
		}

		else if (aGrade >= 60)
			counter[9].inputscore++;// D
		else
			counter[10].inputscore++;// F
	}

	void analyzeGrades() {

		average = Math.round(total / validgrade);

		// 你公式寫錯了喔, -2
		for (int i = 0; i < score.size(); i++) {
			x += Math.pow(score.get(i), 2);
		}
		y = x - Math.pow(average, 2);
		standard_deviation = Math.round(Math.sqrt(y));

	}

	public String toString() {
		String dis = "";
		for (int i = 0; i < counter.length; i++) {
			dis += counter[1] + "\n";
		}
		return "The grade distribution is:" + "\n" + dis;
	}
}
