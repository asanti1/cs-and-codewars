package BinaryTree;

public class Main {
    static void insertNumber(Node base, int num) {
        if (num < base.getNumber()) {
            if (base.getLeftChild() != null) {
                insertNumber(base.getLeftChild(),num);
            } else {
                base.setLeftChild(new Node(num));
            }
        }
        if (num > base.getNumber()) {
            if (base.getRightChild() != null) {
                insertNumber(base.getRightChild(),num);
            } else {
                base.setRightChild(new Node(num));
            }
        }
    }

    static void readPreOrder(Node base) {
        if (base != null) {
            readPreOrder(base.getLeftChild());
            System.out.println(base.getNumber());
            readPreOrder(base.getRightChild());
        }
    }

    public static void main(String[] args) {
        Node base = new Node(50);
        insertNumber(base,45);
        insertNumber(base,35);
        insertNumber(base,25);
        insertNumber(base,36);
        insertNumber(base,60);
        insertNumber(base,110);
        insertNumber(base,120);
        insertNumber(base,140);
        insertNumber(base,111);
        insertNumber(base,108);

        readPreOrder(base);
    }
}