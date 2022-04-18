public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.print("Stack - Java \n"); 
		
		MyStack stack = new MyStack(6);

		stack.push(new Node(10));
		stack.push(new Node(20));
		stack.push(new Node(30));
		
		Node node = stack.peek();
		if (node != null) {
			System.out.print("Peek\n");  
			node.printData();
		}
		
		Node node2 = stack.pop();
		if (node != null) {
			System.out.print("Pop\n");  
			node.printData();
		}

		System.out.print("\n");  
		stack.print();
	}

}