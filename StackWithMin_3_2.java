import java.util.*;

public class StackWithMin_3_2<E> extends Stack<E> {
	public static void main(String[] args) {
		System.out.println("Hello!");
		StackWithMin_3_2<Integer> stack = new StackWithMin_3_2<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(7);

		while(!stack.empty()) {
			System.out.println("pop : " + stack.pop());
		}
		
		stack.min();
	}
	public E min() {
		return (E)"1";
	}
}
