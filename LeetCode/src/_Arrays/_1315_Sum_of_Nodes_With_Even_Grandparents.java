import java.util.LinkedList;
import java.util.Scanner;

public class _1315_Sum_of_Nodes_With_Even_Grandparents {

	class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;

	public static Scanner obj = new Scanner(System.in);

	public _1315_Sum_of_Nodes_With_Even_Grandparents() {

//		LinkedList<Integer> stack=new LinkedList<Integer>();
		LinkedList<Node> queue = new LinkedList();

		this.root.data = obj.nextInt();
		queue.add(root);

		while (!queue.isEmpty()) {

			Node rn = new Node();
			rn = queue.remove();

			int l = obj.nextInt();
			int r = obj.nextInt();

			if (l != null) {
				Node nn = new Node();
				nn.data = l;
				rn.left = nn;
				queue.add(nn);
			}

			if (l != null) {
				Node nn = new Node();
				nn.data = l;
				rn.left = nn;
				queue.add(nn);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1315_Sum_of_Nodes_With_Even_Grandparents bt = new _1315_Sum_of_Nodes_With_Even_Grandparents();

	}

//	public static 

}
