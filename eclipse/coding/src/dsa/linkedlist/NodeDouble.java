package dsa.linkedlist;

public class NodeDouble {
	int data;
	NodeDouble prev;
	NodeDouble next ;
	
	public NodeDouble(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public static void traverse(NodeDouble head) {
		if(head!=null) {
			while(head!=null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
	
	public static NodeDouble insertAtBegin(NodeDouble head, int data) {
		NodeDouble newNode = new NodeDouble(data);
		if(head==null) return newNode;
		newNode.next = head;
		head.prev = newNode;
		return newNode;
	}
	
	public static NodeDouble insertAtLast(NodeDouble head, int data) {
		NodeDouble newNode = new NodeDouble(data);
		if(head==null) return newNode;
		NodeDouble curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
		newNode.prev = curr;
		return head;
	}
	
	public static NodeDouble deleteAtHead(NodeDouble head) {
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		return head;
		
	}
	
	public static NodeDouble deleteAtEnd(NodeDouble head) {
		NodeDouble curr = head;
		while(curr.next.next!=null) {
			curr = curr.next;
		}
		curr.next.prev = null;
		curr.next = null;
		return head;
	}
	
	//VVIP
	public static NodeDouble reverse(NodeDouble head) {
		if(head == null || head.next == null) return head;
		NodeDouble curr = head;
		NodeDouble temp = null;
		while(curr!=null) {
			temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
	}

}
