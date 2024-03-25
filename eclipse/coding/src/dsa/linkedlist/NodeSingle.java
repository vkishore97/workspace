package dsa.linkedlist;

public class NodeSingle {
	int data;
	NodeSingle next;
	
	NodeSingle(int data) {
		this.data = data;
		this.next = null;
	}
	
	//while traversing use head != null
	//while insertion or deletion use head.next!=null
	
	public static void print(NodeSingle head) {
		NodeSingle curr = head;
		while(curr!=null) {
			System.out.println(head.data);
			curr = curr.next;
		}
	}
	
	public static void printRecursive(NodeSingle head) {
		if(head==null) return;
		System.out.println(head.data);
		printRecursive(head.next);
	}
	
	public static NodeSingle insertAtBegin(NodeSingle head, int data) {
		NodeSingle newNode = new NodeSingle(data);
		newNode.next = head;
		return newNode;
	}
	
	public static NodeSingle insertAtEnd(NodeSingle head, int data) {
		NodeSingle newNode = new NodeSingle(data);
		if(head == null) {
			return head;
		}
		NodeSingle curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
//		curr = curr.next;
		curr.next = newNode;
		return head;
	}
	
//	public static Node insertAtEnd2(Node head, int data) {
//		Node newNode = new Node(data);
//		if(head==null) {
//			return newNode;
//		}
//		Node curr = head;
//		while(curr!=null) {
//			curr = curr.next;
//		}
//		curr
//	}
	
	public static NodeSingle insertAtN(NodeSingle head, int position, int data) {
		NodeSingle newNode = new NodeSingle(data);
		if(position==1) {
			newNode.next = head;
			return newNode;
		}
		NodeSingle curr = head;
		for(int i=1;i<=position-2 && curr!=null; i++) {
			curr = curr.next;
		}
		if(curr==null) return head;
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
		
	}
	
	public static NodeSingle deleteAtFirst(NodeSingle head) {
		if(head==null) return head;
		return head.next;
	}
	
	public static NodeSingle deleteAtLast(NodeSingle head) {
		if(head==null) return head;
		NodeSingle curr = head;
		while(curr.next.next!=null) {
			curr = curr.next;
		}
		curr.next = null;
		return head;
	}
	
	public static int search(NodeSingle head, int data) {
		int position=0;
		NodeSingle curr = head;
		while(curr!=null) {
			position++;
			if(curr.data == data) {
				return position;
			} else {
				curr = curr.next;
			}
		}
		return -1;
	}
	
	public static int searchRecursive(NodeSingle head, int data) {
		if(head==null) return -1;
		if(head.data==data) return 1;
		else {
			int res = searchRecursive(head.next,data);
			if(res==-1) return -1;
			else return (res+1);
		}
	}
	
	
	
}