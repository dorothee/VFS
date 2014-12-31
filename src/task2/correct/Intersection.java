package task2.correct;
import java.lang.Math;

public class Intersection {
	
	private static final float PI = (float) 3.14;
	
	public Point solve(Circle one, Circle two){	


		float radSub = (Math.abs(one.getRadius() - two.getRadius())); 
		float radAdd = (Math.abs(one.getRadius() + two.getRadius()));
		float centersDistance = sqrt(sqr(one.getY() - two.y) + sqr(one.x - two.x));

		
		if (radSub == centersDistance && radSub == radAdd){ // one point
			//TODO system of linear equations
		}
		
		else if(radSub < centersDistance && centersDistance < radAdd) //two points
			//TODO system of linear equations
			
		else // no intersection

	}

}
