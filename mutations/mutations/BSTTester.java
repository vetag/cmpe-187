package mutations;

public class BSTTester {
	// Driver Program to test above functions
	public static void main(String[] args) {
		/*
		 * TC_BST_01
		 */
		BinarySearchTree tree1 = new BinarySearchTree();
		/* Let us create following BST 
			        50 
			     /     \ 
			    30      70 
			   /  \    /  \ 
			 20   40  60   80 */
		System.out.println("\nTest Case ID: TC_BST_01");
		tree1.insert(50);

		// print inorder traversal of the BST
		tree1.inorder();
		
		
		/*
		 * TC_BST_02
		 */
		BinarySearchTree tree2 = new BinarySearchTree();
		/* Let us create following BST 
			        50 
			     /     \ 
			    30      70 
			   /  \    /  \ 
			 20   40  60   80 */
		System.out.println("\nTest Case ID: TC_BST_02");
		tree2.insert(50);
		tree2.insert(30);
		tree2.insert(20);
		tree2.insert(40);
		tree2.insert(70);
		tree2.insert(60);
		tree2.insert(80);

		// print inorder traversal of the BST
		tree2.inorder();
		
		
		/*
		 * TC_BST_04
		 */
		BinarySearchTree tree3 = new BinarySearchTree();

		System.out.println("\nTest Case ID: TC_BST_03");
		tree3.insert(50);
		tree3.insert(30);
		tree3.insert(20);
		tree3.insert(50);
		tree3.insert(40);
		tree3.insert(40);
		tree3.insert(70);
		tree3.insert(60);
		tree3.insert(80);

		// print inorder traversal of the BST
		tree3.inorder();
		
		
		/*
		 * TC_BST_04
		 */
		BinarySearchTree tree4 = new BinarySearchTree();
		/* Let us create following BST 
			       -34 
			     /     \ 
			   -83      23 
			      \    /   
			   	  -54 2     
			 			\
		 				  9
		 				   \	
		 					16	*/
		System.out.println("\nTest Case ID: TC_BST_04");
		tree4.insert(-34);
		tree4.insert(23);
		tree4.insert(-83);
		tree4.insert(2);
		tree4.insert(9);
		tree4.insert(16);
		tree4.insert(-54);

		// print inorder traversal of the BST
		tree4.inorder();
	}
}
