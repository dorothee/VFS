package project;

import java.util.List;

public interface ICommand {
	
	Node createDirectory(Node tree, String[] directoryPath);
	public Node deleteDirectory(Node tree, String directoryName);
	//void listDirectory();
	public Node createFile(Node tree, File file);
	public Node deleteFile(Node tree, String fileName);
	//void writeFile();
	//void readFile();
	//void executeFile();
	

}