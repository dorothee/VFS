package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * The main class that will be used to 
 * 	read the instructions from the command line
 * 	interpret the instructions
 * 	build the objects and calls the right functions to execute instructions\
 * 	stops the program when receiving exit
 * @author mariuca
 *
 */

public class Main {
	
	public static void printTree(Node tree){

		System.out.println("/" + tree.getNodeEntry().name);
		for (Node child : tree.getChildren())
			printTree(child);
		
	}

	public static void main(String[] args){
		
		Root rootFile = new Root();
<<<<<<< HEAD
		/* Before using it, you need to define any constructor for Node ---> See class Node*/
		/* Here you cannot use new List(), because List is an interface -- so you need to use a class that implements it, for example LinkedList*/
		Node tree = new Node(rootFile, new LinkedList<Node>());
=======
		Node tree = new Node(rootFile, new List<Node>());
		// missing: assigning type Root to rootFile
>>>>>>> 748d426a6ad9ff5b00cca53cecb3b39227f478ed
	
		/* We also need a variable to execute FileCommands */
		FileCommand fileCommand = new FileCommand();
		
		boolean user = true;
		while(user == true){
				
		System.out.print("Enter your input: ");
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput = null;
			
		try {
		        userInput = br.readLine();
		     } catch (IOException ioe) {
		        System.out.println("IO error trying to read your input!");
		        System.exit(1);
		     }
	
		String[] commands = {"write", "read", "create", "ls", "delete", "execute"};
		String[] types = {"directory", "file"};
			
		String [] tokens = userInput.split("[ ]");


/*    	if command and type are valid program executes*/
    	if (Arrays.asList(commands).contains(tokens[0]) && Arrays.asList(types).contains(tokens[1])){

/*		    for(String s:tokens){
		    		System.out.println(s);
		    	
		    }*/

		    String command = tokens[0]; 
		    String type = tokens[1]; 
		    String [] nodes = tokens[2].split("/"); // here after the split your nodes will be: [, root, A], so we need to remove the first empty element
		    if (nodes.length > 0)
		    	nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
		    int len = tokens.length;
		    //Define the variable content outside of the if, otherwise you cannot use it later on
		    String content = null;
		    if(len==4){
		    	content = tokens[3];
		    }
		    
		    /*the strings you cannot compare like this, you need to use matches*/
		if(type.matches("directory")){
		    	if(command.matches("create") && len==3){
		    		//createDirectory
		    		/* check if the path starts with root */
		    		if (nodes.length == 0 || !nodes[0].matches("root")){
		    			System.err.println("Not in the root file system");
		    			user = false;
		    			break; //return from the loop
		    		}
		    		/* if the path starts with the root look in the next directories */
		    		tree = fileCommand.createDirectory(tree, Arrays.copyOfRange(nodes, 1, nodes.length));
		    		//nodes = Arrays.copyOfRange(nodes, 1, nodes.length);
		    		//for (String n : nodes){
		    		//	if (!tree.containsChild(n))
		    				
		    		//}
		    		printTree(tree);
		    			
		    	}
		    	else if(command.matches("delete") && len==3){;
		    		//deleteDirectory
		    	}
		    	else if(command.matches("ls") && len==3){;
	    			//listDirectory
		    	}
	    	}
		/*the strings you cannot compare like this, you need to use matches -- fill the same*/
		//TODO
		else if(type=="file"){
		    	if(command=="create"){
		    		//createFile
		    	}
		    	else if(command=="delete" && len==3){
		    		//deleteFile
		    	}
		    	else if(command=="write" && len==4){
		    		//writeFile
		    	}
		    	else if(command=="read" && len==3){
		    		//readFile
		    	}
		    	else if(command=="execute" && len==3){
		    		//executeFile
		    	}
		    }
    	}
/*		if first word is exit it closes the program */
    	else if (tokens[0].equals("exit")){
    		user = false;
    		//System.exit(0);
    	}
    	
/*    	if command is not valid program communicates*/
		else {
			System.out.println("Your input is not valid!");
		}

		
		}
    }
}
