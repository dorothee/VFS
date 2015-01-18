package task3;

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
		
	}
}
