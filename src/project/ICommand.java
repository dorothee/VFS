package project;

public interface ICommand {
	
	void createDirectory(Node tree, String[] nodes);
	void deleteDirectory(Node tree, String[] nodes);
	//void listDirectory();
	void createFile();
	void deleteFile();
	//void writeFile();
	//void readFile();
	//void executeFile();

}