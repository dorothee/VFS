package task2.correct;

public class Point {

	private float xx;	
	private float yy;
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public Point(float x, float y){
		this.xx = x;
		this.yy = y;
	}
	
	/*get() and set() methods for x and y*/
	public void setPoint(float x, float y){
		xx = x;
		yy = y;
	}	
	public float getX(){
		return xx;
	}
	public float getY(){
		return yy;
	}

}
