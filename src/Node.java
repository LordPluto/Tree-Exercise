
public class Node {
	private Node parent;
	
	private Node leftChild;
	private Node rightChild;
	
	private int data;
	
	public Node () {
		data = 1;
		
		parent = null;
		leftChild = rightChild = null;
	}
	
	public Node (int value){
		data = value;
		
		parent = null;
		leftChild = rightChild = null;
	}
	
	/**
	 * Gets the parent node (or returns null if no parent)
	 * @return
	 */
	public Node getParent () {
		return parent;
	}
	
	/**
	 * Gets the left child (or returns null if no child)
	 * @return
	 */
	public Node getLeftChild () {
		return leftChild;
	}
	
	/**
	 * Returns the right child (or returns null if no child)
	 * @return
	 */
	public Node getRightChild () {
		return rightChild;
	}
	
	/**
	 * Returns the data of the node.
	 * @return
	 */
	public int getData () {
		return data;
	}
}
