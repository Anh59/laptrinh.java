class Link_List{

	private class Node {

		int data; 
		Node next;	}
	
	Node top;

	Link_List()
	{
		this.top = null;
	}

	
	public void push(int x) 
	{
		
		Node temp = new Node();

		
		if (temp == null) {
			return;
		}
		temp.data = x;

		temp.next = top;

		top = temp;
	}
	public boolean isEmpty()
	{
		return top == null;
	}


	public void pop()
	{
		if (top == null) {
			return;
		}
		top = (top).next;
	}

	public void display()	{

			Node temp = top;
			while (temp != null) {

				System.out.printf("%d ", temp.data);

				temp = temp.next;
			}

		}
}
public class LinkList{
	public static void main(String[] args)
	{
		Link_List ll = new Link_List();
		ll.push(11);
		ll.push(22);
		ll.push(33);
		ll.push(44);
		ll.display();
		ll.pop();
		System.out.println("\nPOp");
		ll.display();

	}
}
