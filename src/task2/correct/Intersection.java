package task2.correct;
import java.lang.Math;

public class Intersection {
	
	public Point[] solve(Circle one, Circle two){	
		

		float radius1 = one.getRadius();
		float radius2 = two.getRadius();
		
		Point center1 = one.getCenter();
		Point center2 = two.getCenter();

		float x1 = center1.getX(); 
		float y1 = center1.getY(); 
		float x2 = center2.getX(); 
		float y2 = center2.getY(); 
		
		//distance between centers of circles
		float d = (float) Math.sqrt(Math.pow(y1 - y2, 2) + Math.pow(x1 - x2, 2));
		
		//calculating "d1"
		float d1 = ((float) Math.pow(radius1, 2) - (float) Math.pow(radius2, 2) + (float) Math.pow(d, 2))/(2*d);
		
		//calculating h = 1/2 a	
		float h = (float) Math.sqrt((float) Math.pow(radius1, 2) - (float) Math.pow(d1, 2));
		

		//radical line length
		//float a = 2*h;				we don't use it
		
		//calculating radical center
		float x3 = (x1 + (d1 *(x2 - x1)))/d;
		float y3 = (y1 + (d1 *(y2 - y1)))/d;
		//Point radicalCenter = new Point(x3, y3);	we don't use it

		
		//how many solutions it has
		float radSub = (Math.abs(radius1 - radius2)); 
		float radAdd = (Math.abs(radius1 + radius2));
		
		Point[ ] result = new Point[2];
		
		if (radSub == d && radSub == radAdd){ // one point of intersection
			float x4 = x3 + (h *(y2 -y1))/d;
			float y4 = y3 - (h *(x2 -x1))/d;				
			Point first = new Point(x4, y4);
			
			result[0] = first;
			result[1] = null;
		}
		
		else if (radSub < d && d < radAdd){ //two points of intersection
			float x4 = x3 + (h *(y2 -y1))/d;
			float y4 = y3 - (h *(x2 -x1))/d;				
			Point first = new Point(x4, y4);
			
			float x5 = x3 - (h *(y2 -y1))/d;
			float y5 = y3 + (h *(x2 -x1))/d;		
			Point second = new Point(x5, y5);
			
			result[0] = first;
			result[1] = second;
		}
		
		else{ // no points of intersection
			result[0] = null;
			result[1] = null;	
		}

		return result;
	}
	
}
