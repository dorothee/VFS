package task2.correct;

public class Point {
	/**
	 * Coordinates of the Point
	 */
	private float x;	//create public get() and set() methods for these fields
						//as they need to be accessed (to retrieve value and set value)
						//by functions outside the class
						//and here they are private (which is good)
	private float y;
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}

}
