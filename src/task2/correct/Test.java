package task2.correct;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Point testPoint1 = new Point(1.5f, 3.2f);
		Point testPoint2 = new Point(0.5f, 1.2f);
		Circle testCircle1 = new Circle(testPoint1, 4.6f);
		Circle testCircle2 = new Circle(testPoint2, 2.6f);
			
		Point[ ] result = new Point[2];
		result = solve(testCircle1, testCircle2); //how to make 'solve' function visible from Intersection 
		
		if(result[0]==null && result[1]==null){
			System.out.println("The points doesn't have intersection");
		}
		else if (result[0]!=null && result[1]==null){
			System.out.println(result[0]);
		}
		else if (result[0]!=null && result[1]!=null){
			System.out.println(result[0]);
			System.out.println(result[1]);
		}
	}

}
