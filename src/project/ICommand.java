package project;

import java.util.List;

public interface ICommand {
	
	//Node createDirectory(Node tree, String[] directoryPath);
	void createDirectory(Node tree, String[] nodes);
	//public Node deleteDirectory(Node tree, String directoryName);
	void deleteDirectory(Node tree, String[] nodes);
	//void listDirectory();
	public Node createFile(Node tree, File file);
	public Node deleteFile(Node tree, String fileName);
	void createFile(Node tree, String[] nodes);
	void deleteFile(Node tree, String[] nodes);
	//void writeFile();
	//void readFile();
	//void executeFile();
	

}