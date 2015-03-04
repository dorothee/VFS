package project;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileCommand implements ICommand{
	
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
		
		return tree;
	}

	@Override
	public Node deleteFile(Node tree, String fileName) {

		return tree;
	}

	@Override
	public Node createDirectory(Node tree, String[] directoryPath) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}