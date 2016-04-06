public class Easter {
	static String calculateEaster(int aYear) {
		int a = aYear % 19;
		int b = aYear % 4;
		int c = aYear % 7;
		//下面這個用法是一個很不錯的寫法! 有感覺到你自己查function的誠意! extra point +2!
		int k = Math.floorDiv(aYear, 100);
		int p = Math.floorDiv((13 + 8 * k), 25);
		int q = Math.floorDiv(k, 4);
		
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		int month, day;
		if (d + e + 22 > 31)// decide its month to be March or April
		{
			day = d + e - 9;
			month = 4;
		} else {
			day = d + e + 22;
			month = 3;
		}
		if (d == 29 && e == 6) {
			day = 19;
		} else if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
			day = 18;
		}
		return "In " + aYear + ", Easter Sunday is: month =" + month + " and day =" + day;
	}
}
