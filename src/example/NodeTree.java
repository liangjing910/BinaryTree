/**
 * Version 1.0
 * Author liangjing
 * Time 2018年2月8日 上午10:54:14
 * Description 
 */

package example;

/**
 * @version 1.0
 * @author liangjing
 *
 *         <p>
 *         Time: 2018年2月8日 上午10:54:14
 *         <p>
 *         Description:
 */
public class NodeTree {
	int data; // 根节点数据
	NodeTree left; // 左子树
	NodeTree right; // 右子树

	public NodeTree() {
		super();
	}

	public NodeTree(int data) { // 实例化二叉树
		super();
		this.data = data;
		left = null;
		right = null;
	}

	public void insert(NodeTree root, int data) {
		if (data > root.data) { // 如果插入的节点大于跟节点
			if (root.right == null) { // 如果右子树为空，就插入，如果不为空就再创建一个节点
				root.right = new NodeTree(data); // 就把插入的节点放在右边
			} else {
				this.insert(root.right, data);
			}
		} else { // 如果插入的节点小于根节点
			if (root.left == null) { // 如果左子树为空，就插入，如果不为空就再创建一个节点
				root.left = new NodeTree(data); // 就把插入的节点放在左边边
			} else {
				this.insert(root.left, data);
			}
		}
	}
}
