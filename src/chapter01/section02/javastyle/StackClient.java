package chapter01.section02.javastyle;


public class StackClient {

	public static void main(String args[]) {
		System.out.println("Start Stack");
		int tempStackSize = 20;
		Stack example = new Stack(tempStackSize); 
		System.out.println("stackSize :" +example.getSize());
		example.printStack();
		for (int i = 0; i <tempStackSize; i++) {
			String one = new String(Integer.toString(i));
			System.out.print("push: ");
			if (example.push(one))
				System.out.println(one);
			else
				System.out.println("Insert Failed");
			
		}
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
