/*
 * [A]100
 * [TA's advise]
 * 1.x-axis,y-axis有沒有可能會是有小數點的呢?
 * 2.寫的很好, 沒什麼問題, Good job!
 * 3.建議之後作業可以的話寫成一個檔案, 除非有特別要求
 * */


//calculate area and perimeter of the rectangle
//print the information of x,y,width,height,Area,Perimeter

class Rectangle {
	int x, y;
	double width, height;
	
	//Rectangle(){this(-1,-1,-1,-1);}//如果可以加入這一行會讓你的程式更好.
	
	Rectangle(int X, int Y, double Width, double Height) {
		this.x = X;
		this.y = Y;
		this.width = Width;
		this.height = Height;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHight() {
		return this.height;
	}

	public String toString() {
		return "java.Rectangle[" + "x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height
				+ "]";
	}
}

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Rectangle1 = new Rectangle(15, 25, 57, 18);
		Rectangle Rectangle2 = new Rectangle(0, 12, 60, 47);
		System.out.println(Rectangle1);
		System.out.println("Area=" + Rectangle1.getWidth() * Rectangle1.getHight());
		System.out.println("Perimeter=" + (Rectangle1.getWidth() + Rectangle1.getHight()) * 2);
		System.out.println(Rectangle2);
		System.out.println("Area=" + Rectangle2.getWidth() * Rectangle2.getHight());
		System.out.println("Perimeter=" + (Rectangle2.getWidth() + Rectangle2.getHight()) * 2);
		System.out.println("\n" + "End of Output!");
	}
}
