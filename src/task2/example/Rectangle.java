package task2.example;

public class Rectangle {
	/**
	 * Length of the rectangle
	 */
	private float length;
	/**
	 * Width of the rectangle
	 */
	private float width;
	
	/**
	 * Constructor
	 * @param length
	 * @param width
	 */
	public Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Function that computes the area of the rectangle
	 * @return
	 */
	public float getArea(){
		return this.length * this.width;
	}
}
