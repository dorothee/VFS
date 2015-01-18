package task3;

public class GlobalCounterCommand implements ICommand{
	
	private static int count = 0;
	
	@Override
	public void execute(){
		count = count + 1;
		System.out.println("Counted value: " + count);
		}	
}
