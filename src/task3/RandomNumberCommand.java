package task3;

public class RandomNumberCommand implements ICommand{
	
	private double max;
	
	public RandomNumberCommand(int max){
		this.max = max;		
	}
	
	@Override
	public void execute(){
		max = Math.random()*max;
		System.out.println("Maximum value: " + max);
	}
}
