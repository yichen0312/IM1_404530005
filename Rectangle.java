
public class Rectangle {
int x,y;
double width,height;
Rectangle(int X,int Y,double Width,double Height)
{
	this.x=X;
	this.y=Y;
	this.width=Width;
	this.height=Height;
	}
public int getX(){return this.x;}
public int getY(){return this.y;}
public double getWidth(){return this.width;}
public double getHight(){return this.height;}

public String toString(){
	return "java.Rectangle["+"x="+this.x+
			",y="+this.y+",width="+this.width+",height="+this.height+"]";}
}
