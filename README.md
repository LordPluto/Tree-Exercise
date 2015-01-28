# Tree-Exercise

Script at a high-level:
  The script asks the user for an integer - this is the depth of the tree that will be created (or in other words, how many layers the tree will contain). After the user provides input, the tree is created.
  
Compiling the script:
  To compile the script, all that is needed is to invoke the Java compiler while in the location of the source file.
  
How the code is organized:

  Node - Node is a self-contained class that simply acts to hold the data, as well as information on its parent and its children. If a node has no children, the children are set as null.
  
  Tree - Tree is a LinkedList of nodes that is formatted in the binary tree pattern - each node has two children and one parent. On Tree creation, the tree takes one argument - the depth of the tree - and creates the nodes that way. The tree creates the nodes by searching for the neighbor - either left or right depending on the position of the child - using a while loop.
  
  NeuroScoutingTree - the main application. Dependent on Java.util for the scanner to get the user input, but that's it. Asks the user for input, creates the tree, and then prints it out.
