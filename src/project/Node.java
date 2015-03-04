package project;

import java.util.List;

/**
 * Class used for the nodes in the tree
 * @author mariuca
 *
 */

public class Node {
	private AEntry nodeEntry;
	private List<Node> children;
	
	/**
	 * Constructor for the Node class
	 * @param nodeEntry
	 * @param children
	 */
	public Node(AEntry nodeEntry, List<Node> children){
		this.nodeEntry = nodeEntry;
		this.children = children;
	}
	
	public AEntry getNodeEntry() {
		return nodeEntry;
	}

	public void setNodeEntry(AEntry nodeEntry) {
		this.nodeEntry = nodeEntry;
	}
	
	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}
	
	/**
	 * Function that adds a child to the list of children
	 * @param child
	 */
	public void addChild(Node child) {
		this.children.add(child);
	}

	
	
	/**
	 * Function that checks if the directory is already a child of the current node
	 * @param directoryName
	 * @return
	 */
//	public Node contains(String[] path){
//		
//
//		for (Node child:children)
//			if(child.nodeEntry.name.matches(directoryName))
//				return child;
//		return null;
//	}
	
	
	
	
}
