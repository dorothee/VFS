package task2.correct;

public class Circle {
	static final float pi = (float) 3.14;
	/**
	 * The center Point of the Circle
	 */
	private Point center; //also here, create public get() and set() methods for center
						  //it will be used by the intersection function	
	/**
	 * The radius of the Circle
	 */
	private float radius;
	/**
	 * First constructor for the Circle
	 * @param center of the Circle as a Point object
	 * @param length of radius of Circle
	 */
	public Circle(Point center, float radius){
		this.center = center;
		this.radius = radius;
	}
	/**
	 * Second constructor for the Circle
	 * This one will build a Point object from x and y
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(float x, float y, float radius){
		this.center = new Point(x, y);
		this.radius = radius;
	}
	/**
	 * Function that computes the area of the Circle
	 * @return 
	 */
	public float getArea(){
		return this.radius * this.radius * pi; //how to  write (this.radius)^2?
		//you can use Math.pow(this.radius, 2); 
		
	}

    public float getLength(){
    	return 2 * pi * this.radius;
    	
    }	
}
