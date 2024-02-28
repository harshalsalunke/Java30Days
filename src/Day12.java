
public class Day12 {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void add(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void reverse() {
		Node prev = null;
		Node current = head;
		Node nextNode;

		while (current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;

		}
		head = prev;
	}

	public static void main(String[] args) {
		Day12 list = new Day12();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Original list:");
		list.display();
		list.reverse();
		System.out.println("Reversed list:");
		list.display();

	}

}
