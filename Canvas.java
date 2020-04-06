import java.awt.Point;
import java.util.*;
public class Canvas {
	static List<Point> lst = new ArrayList<Point>();

    public static void dodaj(int x, int y) {
    	lst.add(new java.awt.Point(x,y));
    }
    public static void brisi(int redosled) {
    	lst.remove(redosled);
    }
	 
	public static void main(String[] args) {
	    dodaj(1,2);
	    dodaj(1,8);
	    dodaj(7,2);
	    dodaj(5,3);
	    lst.stream().forEach((p)-> System.out.print("(" + p.x +"," + p.y + ")"));
	    System.out.println("\n--------------");
	    lst.remove(1);
	    lst.stream().forEach((p)-> System.out.print("(" + p.x +"," + p.y + ")"));

	}

}
