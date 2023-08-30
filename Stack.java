package stack;

public class Stack {
	int a[] = new int[100];
	int top = -1;
	
	public void push(int x) {
		if(top >= 100) {
			System.out.println("Stack overflow");
		}else {
			a[++top] = x;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack underflow!");
		}else {
			int x = a[top--];
			System.out.println(x + " popped!");
		}
	}
	
	public void display() {
		if(top == -1) System.out.println("Stack underflow!");
		else for(int i = 0; i <= top; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public void peek() {
		if(top == -1) {
			System.out.println("Stack underflow!");
		}else {
			System.out.println("Top is " +a[top]);
		}
	}
}
