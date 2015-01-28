import java.util.*;

public class Tree {
	private ArrayList<Node> treeNodes;
		
	public Tree () {
		treeNodes = new ArrayList<Node>();
	}
	
	public Tree (int depth) {
		treeNodes = new ArrayList<Node>();
		
		for(int i = 0;i<depth;i++){
			BuildLayer(i);
		}
	}
	
	private void BuildLayer (int currentLayer){
		
	}
	
	private Node getLeftNeighbor (int currentPosition) {
		return null;
	}
	
	private Node getRightNeighbor (int currentPosition) {		
		return null;
	}
}
