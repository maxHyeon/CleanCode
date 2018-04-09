package chapter01.section02.cstyle;

public class StackClient {
	public static void main(String args[]) {

		System.out.println("Start Stack");
		Stack stackData = new Stack(); // ���� ��ü�� �����Ѵ�.
		StackFunction stackFunction = new StackFunction(); // ���ÿ� ����� �Լ��� ��¡�ϴ�
													// ��ü�� �����Ѵ�.

		stackFunction.printStack(stackData);

		String one = new String("1");
		System.out.print("push: ");
		if (stackFunction.push(stackData, one)) // '1'�� Ǫ���Ѵ�.
			System.out.println(one);
		else
			System.out.println("Insert Failed");
		stackFunction.printStack(stackData);

		String two = new String("2");
		System.out.print("push: ");
		if (stackFunction.push(stackData, two)) // '2'�� Ǫ���Ѵ�.
			System.out.println(two);
		else
			System.out.println("Insert Failed");
		stackFunction.printStack(stackData);

		Object result;

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // '2'�� �˾��Ѵ�.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // '1'�� �˾��Ѵ�.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);

		System.out.print("pop: ");
		result = stackFunction.pop(stackData); // �� �̻� �˾��� �� ����.
		if (result == null)
			System.out.println("Failed");
		else
			System.out.println(result);
		stackFunction.printStack(stackData);
	}
}
