
public class Trie{
	private Node root;

    public Trie() {
        root = new Node();
    }

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root.isEmpty();//buradaki isEmpty Node classinin isEmptysidir.(root -1 ise bostur.)
    }

    public void traverse() {
        if(!isEmpty())
            root.traverse();
    }
	
	

}
