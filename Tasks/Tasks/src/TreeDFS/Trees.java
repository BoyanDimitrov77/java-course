package TreeDFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Trees<T> {

	T data;
	Trees<T> parent;
	List<Trees<T>> children;
	private boolean hasParents;

	public Trees<T> getParent() {
		return parent;
	}

	public void setParent(Trees<T> parent) {
		if (this.parent == null) {
			throw new IllegalArgumentException();
		}
		this.hasParents = true;
		this.parent = parent;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<Trees<T>> getChildren() {
		return children;
	}

	public void setChildren(List<Trees<T>> children) {
		this.children = children;
	}

	public Trees(T data) {
		this.data = data;
		this.children = new LinkedList<Trees<T>>();
	}

	public Trees<T> addChild(T child) {
		Trees<T> childNode = new Trees<T>(child);
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}

	int count = 0;

	public void findDepth(Trees<T> root) {
		Stack<T> stack = new Stack<T>();
		stack.push((T) root);

		while (stack.isEmpty()) {
			Trees<T> node = (Trees) stack.pop();
			System.out.println(node.data);
			if (node != null) {
				System.out.println(node);
			}

		}

		/*
		 * for (int i = 0; i < depth; i++) { System.out.print("\t"); }
		 * System.out.println(node.data);
		 * 
		 * if(node.data==data){ count=depth; }
		 * 
		 * depth++;
		 * 
		 * for (int i = 0; i < node.children.size(); i++) {
		 * findDepth(node.children.get(i), depth,data);
		 * 
		 * 
		 * }
		 * 
		 * return count;
		 */
	}

	private Trees<T> root;

	public void preorderPrint(Trees<T> node) {
		if (node == null)
			return;
		Iterator iter = node.children.iterator();
		while (iter.hasNext()) {
			preorderPrint((Trees<T>) iter.next());

		}
		System.out.print(" " + node.getData());
	}

	/*
	 * private void printDFS(Trees<T> root) { if (this.root == null) { return; }
	 * System.out.println(root.getData()); Trees<T> child = null; for (int i =
	 * 0; i < root.getChildren().size(); i++) { child =
	 * root.getChildren().get(i); printDFS(child); } } public void printDFS() {
	 * this.printDFS(this.root); }
	 */

}
