package project;

import java.util.List;

public interface ICommand {
	
	Node createDirectory(Node tree, String[] directoryPath);
	public Node deleteDirectory(Node tree, String directoryName);
	//void listDirectory();
<<<<<<< HEAD
	public Node createFile(Node tree, File file);
	public Node deleteFile(Node tree, String fileName);
=======
	void createFile(Node tree, String[] nodes);
	void deleteFile(Node tree, String[] nodes);
>>>>>>> 748d426a6ad9ff5b00cca53cecb3b39227f478ed
	//void writeFile();
	//void readFile();
	//void executeFile();
	

}