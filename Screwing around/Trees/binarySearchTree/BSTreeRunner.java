package binarySearchTree;

public class BSTreeRunner
{
	public static void main( String args[] )
	{
		BinarySearchTree bt = new BinarySearchTree();
		bt.add(new Integer(90));
		bt.add(new Integer(80));
		bt.add(new Integer(70));
		bt.add(new Integer(85));
		bt.add(new Integer(100));
		bt.add(new Integer(98));
		bt.add(new Integer(120));

		bt.inOrder();
		bt.preOrder();
		bt.postOrder();
		bt.revOrder();

		bt.getHeight();
		bt.getWidth();
		bt.getNumLeaves();
		bt.getNumNodes();
		bt.getNumLevels();
		bt.isFull();
		bt.search(new Integer(120));
		bt.maxNode();
		bt.minNode();
		bt.levelOrder();
		
		System.out.println(bt.toString());
		
	}
}