package task2.example;

public class Test {
	
	public static void main(String[] args){
		Rectangle testBase = new Rectangle(1.5f, 3.2f);
		Cube testCube = new Cube(testBase, 4.6f);
		
		float cubeVolume = testCube.getVolume();
		System.out.println("The volume of the test cube is " + cubeVolume);
	}
}
