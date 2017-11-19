
import java.util.HashSet;
import java.util.Set;


public class Node {

	private Set<String> attributes;
	public Node(Set<String> attrs) {
		setAttributes(attrs);
	}
	public Set<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Set<String> attributes) {
		this.attributes = attributes;
	}

	
	@Override
	public String toString() {
		return attributes.toString();
	}
	
	// clone of Node
	public Node toClone(){
		Node clone = new Node(getAttributes());
		return clone;
	}
	
	// check whether this node is child of the Node node
	public boolean isChildtOf(Node node){
		if (!getAttributes().equals(node.getAttributes()) && getAttributes().containsAll(node.getAttributes()) ) {
			return true;
		} 
		return false;
	}
	
	public static Set<Node> clonedNodes(Set<Node> nodes){
		Set<Node> clonedNodes = new HashSet<Node>();
		for (Node node : nodes) {
			clonedNodes.add(node.toClone());
		}
		return clonedNodes;
	}
}