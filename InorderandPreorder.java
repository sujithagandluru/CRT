class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self, root):
        self.root = Node(root)

    def inorder_traversal(self, node):
        if node:
            # Traverse left subtree
            self.inorder_traversal(node.left)
            # Visit node
            print(node.value, end=' ')
            # Traverse right subtree
            self.inorder_traversal(node.right)

    def postorder_traversal(self, node):
        if node:
            # Traverse left subtree
            self.postorder_traversal(node.left)
            # Traverse right subtree
            self.postorder_traversal(node.right)
            # Visit node
            print(node.value, end=' ')

# Example Usage
tree = BinaryTree(1)
tree.root.left = Node(2)
tree.root.right = Node(3)
tree.root.left.left = Node(4)
tree.root.left.right = Node(5)

print("Inorder Traversal:")
tree.inorder_traversal(tree.root)  # Output: 4 2 5 1 3

print("\nPostorder Traversal:")
tree.postorder_traversal(tree.root)  # Output: 4 5 2 3 1
