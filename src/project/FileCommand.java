package project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileCommand implements ICommand{
	
<<<<<<< HEAD
	public Node createRecursiveDirectory(Node tree,  String[] directoryPath){
		

		Node subTree = tree;
		List<Node> children = tree.getChildren();
		for (int i = 0; i < directoryPath.length; i++){
			if(tree.getNodeEntry().name.matches(directoryPath[i])){
				subTree = tree;
			}				
			else{
				if (children.size() == 0){ //no child yet
					Node child = new Node(new Directory(directoryPath[i]), new LinkedList<Node>());
					children.add(child);
				}	
				else
					for(int j = 0; j < children.size(); j++)
						if(!children.get(j).getNodeEntry().name.matches(directoryPath[i])){
							Node child = children.get(j);
							child.addChild(new Node(new Directory(directoryPath[i]), new LinkedList<Node>()));
							children.set(j, child);
						}
								
			}
			subTree.setChildren(children);
			
			
		}		
		return subTree;
		
	}
	
	@Override
	public Node deleteDirectory(Node tree, String directoryName){
		return tree;
	}

	@Override
	public Node createFile(Node tree, File file) {
=======
	@Override
	public void createDirectory(Node tree, String[] nodes){
			int len = nodes.length;
			
			if (tree.name = ""){ //if name of Node tree of Root type is empty assign first String from nodes[]
				tree.name = nodes[0]; 
			}
			
			else if (tree.name == nodes[0]){
				Node parent = tree;
				
				for(int c = 1; c < len; c++){ //for every string in nodes[] except Root
					for(int i = 0; i < parent.children.size(); i++){ //check for every Node  in children list
						Node checkList = parent.children.get(i); // take Nodes from list
						
						if(nodes[c]) == checkList.name && checkList.type = "DIRECTORY"){//check if String from array is equal name
																	// from Node in children list and check if Node 
																	// from children list is of the Directory type.
							
							parent = checkList; // Node from list become a parent and then its children are 
							c = c + 1;					//going to be checked
							break ;						
						}
						else{
							Directory d = new Directory();
							Node dir = new Node(dir, new List<Node>);
							d.name = nodes[c]; //name of new directory Node is equal to the one from array
							parent.children.add(dir);// missing code: add node to the list of children
							parent = dir;
							
						}	
					}
				}
				System.out.println("Directory added succesfully.");
			}
			
			else{
				System.out.println("Root name is not valid");
			}

	}
	
	@Override
	public void deleteDirectory(Node tree, String[] nodes){
		//check if directory exists
		//if not display info
		//if exists, delete Node - only last one from nodes[]
		
		int len = nodes.length;
		String dirToRemove = nodes[len-1];
		
		boolean exists = false;
		Node parent = tree;
			
		if(tree.name == nodes[0]){
			if(len==1){
				tree.name == "";
				//+ remove all children
				exists = true;
			}
			else{
				for(int c = 1; c < len; c++){ //for every string in nodes[] check if it exists
					for(int i = 0; i < parent.children.size(); i++){ //check for every Node  in children list
						Node checkList = parent.children.get(i); // take Nodes from list
						
						if(nodes[c]) == checkList.name && checkList.type = "DIRECTORY"){
							if(checkList.name == dirToRemove && c ==len-1){
								checkList.remove(); //remove Node from list, how?
								exists = true;
							}
							else{
								parent = checkList; // Node from list become a parent and then its children are 
								c = c + 1;					//going to be checked
							}
							break;
						}
				}
		}
		if(exists==true){
			System.out.println("Directory removed succesfully.");
		}
		else{
			System.out.println("Directory has not been found.");
		}
}			
	
	@Override
	public void createFile(Node tree, String[] nodes){
		//divide file name from list of nodes, check if it's correct name (with ".")
		//check if directory exists and if there doesn't exist file with the same name, if yes, display info
		//if not exist create new Node type File and add to the list (but file can't have children! - leaf)
>>>>>>> 748d426a6ad9ff5b00cca53cecb3b39227f478ed
		
		return tree;
	}

	@Override
<<<<<<< HEAD
	public Node deleteFile(Node tree, String fileName) {

		return tree;
	}

	@Override
	public Node createDirectory(Node tree, String[] directoryPath) {
		// TODO Auto-generated method stub
		return null;
=======
	public void deleteFile(Node tree, String[] nodes){
		//divide file name from list of nodes, check if it's correct name (with ".")
		//check if directory exists, if nor display info
		//check if file exit. if yes delete file if not display info.
		
>>>>>>> 748d426a6ad9ff5b00cca53cecb3b39227f478ed
	}
	
	
}