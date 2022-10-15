package ex5;

public class Stack {
	  private int a[];
	  private int top,len,size;

	  public Stack(int size) {
	    a = new int[size];
	    len = 0;
	    top = -1;
	  }
	  
	  public Boolean isFull() {
		  return len == size - 1;
	  }
	  
	  public Boolean isEmpty() {
	    return top == -1;
	  }
	 
	  public void push(int el) {
	    if (isFull()) {
	      System.out.println("Stack Full");
	    }
	    System.out.println("Inserting: " + el);
	    a[++top] = el;
	  }
	  
	  public int pop() {
	    if (isEmpty()) {
	      System.out.println("Stack Empty");
	    }
	    return a[top--];
	  }
	  
	  public int getSize() {
	    return top + 1;
	  }

	  
	  public int topMost() {
		    return a[top];
	  }
	  
	  public void printElements() {
	    for (int i = 0; i <= top; i++) {
	      System.out.println(a[i] + " ");
	    }
	  }
}

