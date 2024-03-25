package dsa.linkedlist;

public class MainDouble {
	public static void main(String[] args) {
		NodeDouble n1 = new NodeDouble(10);
		NodeDouble n2 = new NodeDouble(20);
		NodeDouble n3 = new NodeDouble(30);
		NodeDouble n4 = new NodeDouble(40);
//		Node n1 = new Node(50);
//		Node n1 = new Node(60);
		n1.next = n2;
		n2.prev = n1;
		n2.next = n3;
		n3.prev = n2;
		n3.next = n4;
		n4.prev = n3;
		
		NodeDouble.traverse(NodeDouble.insertAtBegin(null, 1));
		
		//Node.(Node.insertAtBegin(null, 1));
		
	}
}
