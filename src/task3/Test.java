package task3;
import java.io.*;

public class Test {

	public static void main(String [] args){
		MessageCommand mCommand = new MessageCommand("Hola, soy Constructor de Catalunia!");
		GlobalCounterCommand gcCommand = new GlobalCounterCommand();
		RandomNumberCommand rnCommand = new RandomNumberCommand(1);
		
		mCommand.execute();
		gcCommand.execute();
		rnCommand.execute();
		
		rnCommand.execute();
		gcCommand.execute();
		
		System.out.print("Enter your input: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = null;
		
		try {
	         userInput = br.readLine();
	      } catch (IOException ioe) {
	         System.out.println("IO error trying to read your input!");
	         System.exit(1);
	      }
		
        String [] tokens = userInput.split("[\\W]");
        for(String s:tokens){
            System.out.println(s);
        }
		
	}
}
