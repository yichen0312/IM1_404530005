//calculate area and perimeter of the rectangle
//print the information of x,y,width,height,Area,Perimeter
public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle Rectangle1=new Rectangle(15,25,57,18);
Rectangle Rectangle2=new Rectangle(0,12,60,47);
System.out.println(Rectangle1);
System.out.println("Area="+Rectangle1.getWidth()*Rectangle1.getHight());
System.out.println("Perimeter="+(Rectangle1.getWidth()+Rectangle1.getHight())*2);
System.out.println(Rectangle2);
System.out.println("Area="+Rectangle2.getWidth()*Rectangle2.getHight());
System.out.println("Perimeter="+(Rectangle2.getWidth()+Rectangle2.getHight())*2);
System.out.println("\n"+"End of Output!");
	}

}
