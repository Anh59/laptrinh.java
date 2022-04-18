public class MyStack { 
	private int maxSize; 
	private int top; 
	private Node[] stack;
	
	public MyStack(int maxSize) { 
		this.maxSize = maxSize;
		this.top = -1;
		this.stack = new Node[maxSize];
	} 

	public void push(Node node) {
		if (this.isFull()) {
			System.out.print("Stack is full \n"); 
			return;
		}
		this.top++; 
		this.stack[this.top] = node;
	} 

	public Node pop() {
		if (this.isEmpty()) {
			System.out.print("Stack is empty \n"); 
			return null;
		}
		Node node = this.stack[this.top];
		this.top--; 
		return node;
	} 

	public Node peek() {
		if (this.isEmpty()) {
			System.out.print("Stack is empty \n"); 
			return null;
		}  
		return this.stack[this.top];
	} 

	public boolean isEmpty() {  
		return (this.top == -1);
	} 

	public boolean isFull() {  
		return (this.top + 1 == this.maxSize);
	} 
	
	public void print() {
		System.out.print("Stack: \n");  
		for (int i = 0; i <= this.top; i++) {
			this.stack[i].printData();
		}
	} 
}
