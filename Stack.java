 package Stack;

public class Stack {
	private int top; //peek
	private int maxSize; //stack store max elements
	private char[]stackArray; //array
	
	public Stack(int maxSize) {  //constructor
		this.top = -1;
		this.stackArray = new char[maxSize];
		this.maxSize = maxSize;
		
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}  //isemty method
	
	public boolean isFull() {
		return(top == maxSize - 1);
	}  //is full method
	
	//Push method
	public void push(char ch) {
		if(!isFull()) {
			stackArray[++top] = ch;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	//Pop method
	public char pop() {
		if(!isEmpty()) {
		return stackArray[top--];
	}
		else {
			System.out.println("Stack is Empty");
		}
		return 0;
	}
	//Peek method
	
	public char peek() {
		
	if(!isEmpty()) {
		return stackArray[top];
	}
	else {
		System.out.println("Stack is Empty");
	}
		return 0;
		
	}
	public void display() {
		System.out.println("Printing the stack elements");
		int i = top;
		do {
			System.out.println(stackArray[i] + "");
			i--;
		}
		while(i >= 0);
		
	}

	public void push(String string) {
		// TODO Auto-generated method stub
		
	}

	

}
