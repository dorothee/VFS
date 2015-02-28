package project;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

	public static void main(String[] args){
		
		Root rootFile = new Root();
		Node tree = new Node(rootFile, new List<Node>());
		// missing: assigning type Root to rootFile
	
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
		    String [] nodes = tokens[2].split("/");
		    int len = tokens.length;
		    if(len==4){
		    	String content = tokens[3];
		    }

		if(type=="directory"){
		    	if(command=="create" && len==3){
		    		//createDirectory
		    	}
		    	else if(command=="delete" && len==3){;
		    		//deleteDirectory
		    	}
		    	else if(command=="ls" && len==3){;
	    			//listDirectory
		    	}
	    	}

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
