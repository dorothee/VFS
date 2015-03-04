package project;

public class Directory  extends AEntry{
	
	/**
	 * Constructor for the class Directory
	 * Directories will have given names.
	 * @param name
	 */
	public Directory(String name){
		this.name = name;
		this.type = EntryType.DIRECTORY;
	}
	
}