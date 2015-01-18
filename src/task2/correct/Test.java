package task2.correct;

public class Test {

	public static void main(String[] args) {
		Point testPoint1 = new Point(1.5f, 3.2f);
		Point testPoint2 = new Point(0.5f, 1.2f);
		Circle testCircle1 = new Circle(testPoint1, 4.6f);
		Circle testCircle2 = new Circle(testPoint2, 2.6f);
			
		Point[ ] result = new Point[2];
		/* Initialize an intersection object (because you want to call its method)*/
		Intersection intersection = new Intersection();
		/* Call its method */
		result = intersection.solve(testCircle1, testCircle2); //how to make 'solve' function visible from Intersection 
		
		if(result[0]==null && result[1]==null){
			System.out.println("The points doesn't have intersection");
		}
		else if (result[0]!=null && result[1]==null){
			/* Here you should rather print a message */
			System.out.println("The circles don't intersect ");
		}
		else if (result[0]!=null && result[1]!=null){
			/* The "result" objects are point and in order to print the points
			 * you have to print each of their fields (x and y)  */
			System.out.println(result[0].getX() + " " + result[0].getY());
			System.out.println(result[1].getX() + " " + result[1].getY());
		}
	}

}
