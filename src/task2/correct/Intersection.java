package task2.correct;

public class Intersection {
	/**
	 * Constructor for the Intersection without parameters
	 */
	public Intersection(){}
	/**
	 * Function solving intersection problem
	 */	
	public Point solve(Circle one, Circle two){
		
		private float radSub = (abs(one.radius - two.radius));
		private float radAdd = (abs(one.radius + two.radius));
		private float centersDistance = sqrt(sqr(one.y - two.y) + sqr(one.x - two.x));

		if (radSub == centersDistance == radAdd){ // one point
			//TODO system of linear equations
		}
		
		else if(radSub < centersDistance < radAdd) //two points
			//TODO system of linear equations
			
		else // no intersection

	}

}
