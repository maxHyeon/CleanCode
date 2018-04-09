package chapter01.section02.javastyle;


public class StackClient {

	public static void main(String args[]) {
		System.out.println("Start Stack");
		Stack example = new Stack(); 
		example.printStack();

		String one = new String("1");
		System.out.print("push: ");
		if (example.push(one))
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		example.printStack();

		String two = new String("2");
		System.out.print("push: ");
		if (example.push(two))
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		example.printStack();

		Object result;

		System.out.print("pop: ");
		result = example.pop();
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();

		System.out.print("pop: ");
		result = example.pop(); 
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();

		System.out.print("pop: ");
		result = example.pop(); 
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		example.printStack();
	}
}
