package pekan3_2511533017;

public class stackArray_2511533017 {
	static final int MAX_3017= 1000;
	int top_3017;
	int a[] = new int [MAX_3017];
	boolean isEmpty3017()
	{
		return (top_3017 < 0);
	}
	stackArray_2511533017()
	{
		top_3017 = -1;
	}
	boolean push_3017(int x)
	{
		if (top_3017 >= (MAX_3017 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_3017] = x;
			System.out.println(x + " dimasukan dalam stack");
			return true;
		}
	}
	int pop_3017()
	{
		if (top_3017 <0) { 
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_3017--];
			return x;
		}
	}
	int peek_3017()
	{
		if (top_3017 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_3017];
			return x;
		}
	}
	void print_3017() {
		for(int i = top_3017;i>-1;i--) {
			System.out.println(" "+ a[i]);
		}
	}
}
