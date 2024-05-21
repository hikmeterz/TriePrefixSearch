import java.util.ArrayList;

public class Node {
	
	private char value;
    private Node parent;
    private ArrayList<Node> children;

    public Node() {
        children = new ArrayList<>();
        this.parent = null;
        this.value = ' ';
    }

    public Node(Node parent, char value) {
        children = new ArrayList<>();
        this.parent = parent;
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getChild(int index) {
        return children.get(index);
    }

    public void addChild() {
        children.add(new Node(this, ' '));
    }

    public void addChild(char value) {
        children.add(new Node(this, value));
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getSize() {
        return children.size();
    }

    public boolean isEmpty() {
        return value == -1;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public void traverse() {
        System.out.println("Parent: " + parent + "\tChildCount: " + getSize() + "\tIsLeaf: " + isLeaf() + "\tValue: " + value);
        for(Node node : children)
            node.traverse();
    }

}
