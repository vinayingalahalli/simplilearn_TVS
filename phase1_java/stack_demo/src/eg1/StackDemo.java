package eg1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(1000);
		s.push(900);
		s.push(1000);
		s.push(5000);
		s.push(600);
		s.push(400);
		s.push(300);
		s.push(900);
		System.out.println(s);
		
		System.out.println("s.peek() : "+s.peek());
		
		System.out.println("After peek : "+s);
		System.out.println("s.pop() : "+s.pop());
		System.out.println("after pop : "+s);
		System.out.println("s.pop() again : "+s.pop());
		System.out.println("after pop again : "+s);
		System.out.println("s.search(100) : "+s.search(100));
		System.out.println("s.search(400) : "+s.search(400));
		System.out.println("s.search(1000) : "+s.search(1000));
		
		

	}

}
