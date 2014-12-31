package task2.correct;

public class Circle {
	
	private static final float pi = (float) 3.14;
	/**
	 * The center Point of the Circle
	 */
	private Point center; 	
	/*get() and set() methods for center*/
	public void setCenter(Point c){
		center = c;
	}	
	public Point getCenter(){
		return center;
	}
	
	/**
	 * The radius of the Circle
	 */
	private float radius;
	/*get() and set() methods for radius*/
	public void setRadius(float r){
		radius = r;
	}	
	public float getRadius(){
		return radius;
	}
	/**
	 * First constructor for the Circle
	 * @param center of the Circle as a Point object
	 * @param length of radius of Circle
	 */
	public Circle(Point center, float radius){
		if (!(radius > 0)) throw new IllegalArgumentException("Radius must be positive");
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
		return (float) Math.pow(this.radius, 2);  		
	}

    public float getLength(){
    	return 2 * pi * this.radius;    	
    }	
}
