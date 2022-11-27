public class Main
{
	public static void main(String[] args) {
		CircularDLL cdll = new CircularDLL();
		cdll.insertAtTail(5);
		cdll.insertAtTail(4);
		cdll.insertAtTail(3);
		cdll.insertAtTail(2);
		cdll.insertAtTail(17);
		cdll.insertAtTail(9);
		System.out.println("ORIGINAL:");
		System.out.println(cdll.toString() + '\n');
		System.out.println("Rotating Forward twice:");
		cdll.rotate(2);
		System.out.println(cdll.toString() + '\n');
		System.out.println("Rotating Backwards three times:");
		cdll.rotateBackwards(3);
		System.out.println(cdll.toString());
	}
}