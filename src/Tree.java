
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
	
	private void BuildLayer(int currentDepth, int targetDepth, Node currentNode){
		if(currentDepth == targetDepth - 1){
			
		} else {
			if(currentNode.getLeftChild() != null && currentNode.getRightChild() != null){
				BuildLayer(currentDepth+1, targetDepth, currentNode.getLeftChild());
				BuildLayer(currentDepth+1, targetDepth, currentNode.getRightChild());
			} else {
				System.out.println("Error found. Something didn't get set properly.");
			}
		}
	}
}
