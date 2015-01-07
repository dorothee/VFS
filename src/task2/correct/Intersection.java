package task2.correct;
import java.lang.Math;

public class Intersection {
	
	private static final float PI = (float) 3.14;
	
	public Point solve(Circle one, Circle two){	

		float radius1 = one.getRadius();
		float radius2 = two.getRadius();
		/* here you can add the same type of function to access x and y from the center of the Circle
		 * so you have class Circle which has Point center
		 * 		make a function in Circle to retrieve first the center: getCenter() -- should return an object of type Point
		 * 		retrieve the center: Point center = one.getCenter();
		 * 		call the function getX() from the object center */
		float x1; //= //???? 
		float y1; //= //??
		float x2; //= ///??
		float y2; //= //???
		
		//distance between centers of circles
		float d = sqrt(sqr(one.getY() - two.y) + sqr(one.x - two.x)); //not working, how??????
																	// the same problem as above
		
		
		//calculating "d1"
		float d1 = ((float) Math.pow(radius1, 2) - (float) Math.pow(radius2, 2) + (float) Math.pow(d, 2))/(2*d);
		
		/* sqrt is also from Math lib, so call Math.sqrt */
		//calculating h = 1/2 a	
		float h = sqrt((float) Math.pow(radius1, 2) - (float) Math.pow(d1, 2));
		
		//radical line length
		float a = 2*h;
		
		//calculating radical center
		float x3 = (x1 + (d1 *(x2 - x1)))/d;
		float y3 = (y1 + (d1 *(y2 - y1)))/d;
		Point radicalCenter = new Point(x3, y3);
		
		//how many solutions it has
		float radSub = (Math.abs(radius1 - radius2)); 
		float radAdd = (Math.abs(radius1 + radius2));
		
		//i wanted to put code inside if into methods
		// but i didn't know how to use x&y's from Point one and two
		// which are part of Circles class
		if (radSub == d && radSub == radAdd){ // one point
			float x4 = x3 + (h *(y2 -y1))/d;
			float y4 = y3 - (h *(x2 -x1))/d;				
			Point first = new Point(x4, y4);
		}
		
		if(radSub < d && d < radAdd){ //two points
			float x4 = x3 + (h *(y2 -y1))/d;
			float y4 = y3 - (h *(x2 -x1))/d;				
			Point first = new Point(x4, y4);
			
			float x5 = x3 - (h *(y2 -y1))/d;
			float y5 = y3 + (h *(x2 -x1))/d;		
			Point second = new Point(x5, y5);
		}
	}
	// how to return values? because there will be two, one or 0 points
	
	/* you have two options:
	 * 	1. make two fields in the class Intersection: Point A, B 
	 * 		and make this function return an Intersection object (instead of Point);
	 * 		if you have no points return null 
	 *  2. return an array of Point: Point[] 
	 *  	if you have no intersection return null 
	 *  make sure in the Test function to test if you return null --- and print that the circles don't intersect */
	
}
