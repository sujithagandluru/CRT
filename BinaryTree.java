class Node {
    int data;
    Node left;
    Node right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    public BinaryTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
    public void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    public void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public void printPostorder(Node node) {
        if (node == null) return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }
    public int findHeight(Node node) {
        if (node == null) return -1;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right); 
    }
    public int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    
    public int sumOfNodes(Node node) { 
        if (node == null) return 0;
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }
    public int findMax(Node node) {
        if (node == null) return Integer.MIN_VALUE;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);
        return Math.max(node.data, Math.max(leftMax, rightMax));
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();       
        System.out.print("Preorder Traversal: ");
        tree.printPreorder(tree.root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        tree.printInorder(tree.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        tree.printPostorder(tree.root);
        System.out.println();
        int height = tree.findHeight(tree.root);
        System.out.println("Height of Tree: " + height);
        int totalNodes = tree.countNodes(tree.root);
        System.out.println("Total Number of Nodes: " + totalNodes);
        int leafNodes = tree.countLeafNodes(tree.root);
        System.out.println("Number of Leaf Nodes: " + leafNodes);
        int sum = tree.sumOfNodes(tree.root);
        System.out.println("Sum of All Node Values: " + sum);
        int maxValue = tree.findMax(tree.root);
        System.out.println("Maximum Value in Tree: " + maxValue);
    }
}
