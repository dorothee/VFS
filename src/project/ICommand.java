package project;

public interface ICommand {
	
	void createDirectory(Node tree, String[] nodes);
	void deleteDirectory(Node tree, String[] nodes);
	//void listDirectory();
	void createFile(Node tree, String[] nodes);
	void deleteFile(Node tree, String[] nodes);
	//void writeFile();
	//void readFile();
	//void executeFile();

}