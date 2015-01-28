import java.util.*;

public class NeuroScoutingTree {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int treeDepth = reader.nextInt();
		
		Tree testTree = new Tree(treeDepth);
		
		System.out.println(testTree.printTree());
		
		reader.close();
	}
}
