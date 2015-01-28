
public class Tree {
	private Node origin;
	
	private int treeDepth;
	
	public Tree () {
		origin = new Node();
		
		treeDepth = 1;
	}
	
	public Tree (int depth) {
		origin = new Node();
		
		treeDepth = depth;
		
		for(int i = 2;i<=treeDepth;i++){
			BuildLayer(1,i,origin);
		}
	}
	
	/**
	 * Builds the layer given by target depth recursively.
	 * @param currentDepth
	 * @param targetDepth
	 * @param currentNode
	 */
	private void BuildLayer (int currentDepth, int targetDepth, Node currentNode){
		if(currentDepth == targetDepth - 1){		//We found our target depth.
			Node leftNeighbor = getLeftNeighbor(currentNode);
			if(leftNeighbor == null){
				Node newNode = new Node(currentNode.getData());
				newNode.setParent(currentNode);
				currentNode.setLeftChild(newNode);
			}
			else {
				Node newNode = new Node(currentNode.getData() + leftNeighbor.getData());
				newNode.setParent(currentNode);
				currentNode.setLeftChild(newNode);
			}
			
			Node rightNeighbor = getRightNeighbor(currentNode);
			if(rightNeighbor == null){
				Node newNode = new Node(currentNode.getData());
				newNode.setParent(currentNode);
				currentNode.setRightChild(newNode);
			}
			else {
				Node newNode = new Node(currentNode.getData() + rightNeighbor.getData());
				newNode.setParent(currentNode);
				currentNode.setRightChild(newNode);
			}			
		}
		else {
			if(currentNode.getLeftChild() != null && currentNode.getRightChild() != null){
				BuildLayer(currentDepth+1, targetDepth, currentNode.getLeftChild());
				BuildLayer(currentDepth+1, targetDepth, currentNode.getRightChild());
			}
			else {
				System.err.println("Error found. Something didn't get set properly.");
			}
		}
	}
	
	/**
	 * Gets the current Node's parent's left neighbor.
	 * @param currentNode
	 * @return
	 */
	private Node getLeftNeighbor (Node currentNode) {
		int rowsUp = 0;
		while(currentNode.getParent() != null){
			if(currentNode.getParent().getLeftChild() == currentNode){
				currentNode = currentNode.getParent();
				++rowsUp;
			}
			else if(rowsUp != 0){
				currentNode = currentNode.getParent().getLeftChild();
				--rowsUp;
				while(rowsUp >= 0){
					currentNode = currentNode.getRightChild();
					--rowsUp;
				}
				return currentNode;
			}
			else {
				return currentNode.getParent().getLeftChild();
			}
		}
		
		return null;
	}
	
	/**
	 * Gets the current Node's parent's right neighbor
	 * @param currentNode
	 * @return
	 */
	private Node getRightNeighbor (Node currentNode) {
		int rowsUp = 0;
		while(currentNode.getParent() != null){
			if(currentNode.getParent().getRightChild() == currentNode){
				currentNode = currentNode.getParent();
				++rowsUp;
			}
			else if(rowsUp != 0){
				currentNode = currentNode.getParent().getRightChild();
				--rowsUp;
				while(rowsUp >= 0){
					currentNode = currentNode.getLeftChild();
					--rowsUp;
				}
				return currentNode;
			}
			else {
				return currentNode.getParent().getRightChild();
			}
		}
		
		return null;
	}
	
	/**
	 * Prints the tree in pre-order form. That is, center-left-right
	 * @return
	 */
	public String printTree () {
		return  origin.getData() + "-" + 
					printTree(origin.getLeftChild()) + "-" + printTree(origin.getRightChild());
	}
	
	/**
	 * Private string used to recursively print the tree.
	 * @param currentNode
	 * @return
	 */
	private String printTree (Node currentNode) {
		if(currentNode.getLeftChild() != null && currentNode.getRightChild() != null){
			return currentNode.getData() + "-" +
					printTree(currentNode.getLeftChild()) + "-" + printTree(currentNode.getRightChild());
		} else {
			return ""+currentNode.getData();
		}
	}
}
