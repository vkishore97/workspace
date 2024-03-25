package dsa.linkedlist;

public class MainCircular {
	public static void main(String[] args) {
		NodeCircular n1 = new NodeCircular(1);
		NodeCircular n2 = new NodeCircular(2);
		NodeCircular n3 = new NodeCircular(3);
		NodeCircular n4 = new NodeCircular(4);
		NodeCircular n5 = new NodeCircular(5);
		NodeCircular n6 = new NodeCircular(61);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n1;
		
		NodeCircular head = n1;
		
		
	}
}
