package dsa.linkedlist;

public class MainSingle {
	public static void main(String[] args) {
		NodeSingle n1 = new NodeSingle(1);
		NodeSingle n2 = new NodeSingle(2);
		NodeSingle n3 = new NodeSingle(3);
		NodeSingle n4 = new NodeSingle(4);
		NodeSingle n5 = new NodeSingle(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		NodeSingle.print(n1);
		
	}
}
