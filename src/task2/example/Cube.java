package task2.example;

public class Cube {

	/**
	 * The cube's face
	 */
	private Rectangle base;
	/**
	 * The cube's height
	 */
	private float height;
	
	/**
	 * First constructor for the cube
	 * @param base the face as a Rectangle object
	 * @param height the height of the cube
	 */
	public Cube(Rectangle base, float height){
		this.base = base;
		this.height = height;
	}
	
	/**
	 * Second constructor for cube
	 * This one will build a Rectangle object from length and width
	 * @param length
	 * @param width
	 * @param height
	 */
	public Cube(float length, float width, float height){
		this.base = new Rectangle(length, width);
		this.height = height;
	}
	
	/**
	 * Function that computes the volume of the cube
	 * @return 
	 */
	public float getVolume(){
		return this.base.getArea() * this.height;
	}
	
}
