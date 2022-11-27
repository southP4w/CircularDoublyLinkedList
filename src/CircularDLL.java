class Node
{
	int data;
	Node next, prev;

	public Node(int data) {
		this.data = data;
	}
}

public class CircularDLL
{
	private Node head, tail;
	private int size;

	public CircularDLL() {
		size = 0;
		head = tail = null;
	}

	public void insertAtTail(int data) {
		Node temp = new Node(data);
		if (isEmpty())
			head = temp;
		else {
			tail.next = temp;
			temp.prev = tail;
		}
		tail = temp;
		head.prev = tail;
		tail.next = head;
		size++;
		temp = null;
	}

	public void rotate(int n) {
		if (isEmpty() || n <= 0)
			return;
		for (int i = 0; i < n; i++)
			head = head.next;
	}

	public void rotateBackwards(int n) {
		if (isEmpty() || n <= 0)
			return;
		for (int i = 0; i < n; i++)
			head = head.prev;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder().append('{');
		Node current = head;
		while (current.next != head) {
			sb.append(current.data).append(", ");
			current = current.next;
		}
		sb.append(current.data).append('}');

		return sb.toString();
	}
}