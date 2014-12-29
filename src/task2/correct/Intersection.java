package task2.correct;

public class Intersection {
	
	//declare here the constant pi
	//private static final float PI = 3.14...
	
	/**
	 * Constructor for the Intersection without parameters
	 */
	//you don't need a constructor always
	//unless you want to initialize something here
	//constructors are used mostly to initialize the fields (here there are none)
	//but I am happy you got used to add constructor :-)
	public Intersection(){}
	/**
	 * Function solving intersection problem
	 */	
	public Point solve(Circle one, Circle two){
		
		//inside of a function we cannot have fields
		//which are declared with private, public or protected
		//but we can have variables
		//so just remove the private		
		
		//abs is not declared or recognized here
		//there is a (static) function abs though, from Math library (already implemented in the mighty Java libs)
		//to use that you need to import java.util.Math up there, before the class declaration
		// and call Math.abs(bla bla bla);
		
		//also, here you can see that you are trying to access a private field (radius) from Circle class
		//so you have 2 options:
			//in the Circle class, declare the field radius as public (not recommended)
			//in Circle class, create a method called getRadius() which returns the radius field of the Circle class
			//and call one.getRadius()
		private float radSub = (abs(one.radius - two.radius)); 
		private float radAdd = (abs(one.radius + two.radius));
		private float centersDistance = sqrt(sqr(one.y - two.y) + sqr(one.x - two.x));

		//here you cannot have more than one condition to check in the if
		// you shoud separate them using a logic operator (|| or &&)
			//example radSub == centersDistance && radSub == radAdd
		// '||' means that either first or the second needs to be true
		// '&&' means both need to be true to pass the if condition
		if (radSub == centersDistance == radAdd){ // one point
			//TODO system of linear equations
		}
		
		else if(radSub < centersDistance < radAdd) //two points
			//TODO system of linear equations
			
		else // no intersection

	}

}
