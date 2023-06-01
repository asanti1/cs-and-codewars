package BinaryTree;

public class Node {
    private int number;
    private Node leftChild;
    private Node rightChild;

    public Node(int number) {
        this.number = number;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
