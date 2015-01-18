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
