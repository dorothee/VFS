package task3;

public class MessageCommand implements ICommand {

	private String message;
	
	public MessageCommand(String message){
		this.message = message;
	}
	
	@Override
	public void execute(){
		System.out.println(message);
	}

}
