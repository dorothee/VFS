package project;

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
		 
	    String [] tokens = userInput.split("[\\W]");
	    
/*    	if command is valid program divide input*/
    	if (Arrays.asList(commands).contains(tokens[0])){

		    for(String s:tokens){
		    		System.out.println(s);
		    	
		    }
		    
		    int len = tokens.length;
		    System.out.println(len);
		    
			String command = null;
			String type = null;
			String content = null;
			
		    command = tokens[0];
		    type = tokens[1];
		    
		    if(type=="directory"){
		    	for(int i=0; i < len; i++){		  
					String[] nodes = new String[len-3];
		    		nodes[i] = tokens[i+3];
		    		System.out.println(nodes[i]);
		    	}
		    }
		    
		    else if(type=="file"){
		    		//TODO
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