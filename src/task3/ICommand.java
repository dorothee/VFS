package task3;

/**
 * Command interface with execute() method;
 * The interfaces methods are _always_ abstract;
 * Each class that implements ICommand has to implement (@Overrride) the methods with specific implementation.
 * 
 * @author dorothee
 *
 */
public interface ICommand {

	/**
	 * Executes the given command.
	 */
	void execute();
}

class MessageCommand implements ICommand{
	
	public MessageCommand(){
		System.out.println("Hola, soy Constructor de Catalunia!");
	}
	
	@Override
	public void execute(){
		new MessageCommand();
	}
}

class RandomNumberCommand implements ICommand{
	
	private double max;
	
	public RandomNumberCommand(){
		this.max = 1.0;		
	}
	
	@Override
	public void execute(){
		max = Math.random();
		System.out.println("Maximum value: " + max);
	}
	
static class GlobalCounterCommand implements ICommand{
	
	private static int count = 0;
	
	@Override
	public void execute(){
		count = count + 1;
		System.out.println("Counted value: " + count);
		}	
	}
}
