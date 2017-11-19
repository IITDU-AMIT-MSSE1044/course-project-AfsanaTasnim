

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author This class is a model to store the information of logs, healing
 *         action and the signature of issue Issue represents the document
 *         vector in similar issue retrieval
 */
public class Context {

	
	// nodes of FCA graph representation of an issue
	private Set<Node> nodes;

	// failed transaction and succeeded transactions given a issue
	private Set<Node> getNodes() {
		return nodes;
	}

	private void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}

	// generate the graphs for the given context
	public void generateGraphs() {
		Set<Node> extractedNodes = new HashSet<Node>();
		
		
		for (Node currentNode : Node.clonedNodes(getNodes())) {
			for (Node storedNode : Node.clonedNodes(getNodes())) {
				if (currentNode.isChildtOf(storedNode)) {
					// add stored node to parent nodes
					// System.out.println(currentNode+" is child of "+storedNode);
					// // check whether stored node is present as subset in
					// parent nodes
					boolean isStoredNodePresentAsParent = false;
					// delete the nodes from parent nodes which are parent of
					// stored node
					Set<Node> toDeletenodes = new HashSet<Node>();
					for (Node node : extractedNodes) {
						if (storedNode.isChildtOf(node)) {
							toDeletenodes.add(node);
						}
						if (node.isChildtOf(storedNode)) {
							isStoredNodePresentAsParent = true;
						}
					}
					for (Node node : toDeletenodes) {
						extractedNodes.remove(node);
						// System.out.println("Removed "+node);
					}
					if (!isStoredNodePresentAsParent) {
						// System.out.println("added "+storedNode);
						extractedNodes.add(storedNode.toClone());
					} else {
						// System.out.println("ignored "+storedNode);
					}
				}
			}
		}
		
		System.out.println("After BIDE");
		for (Node node : extractedNodes) {
			System.out.println(node);
		}

	}

	public Context(Set<Node> nodes) {
		setNodes(nodes);
		generateGraphs();
	}

}