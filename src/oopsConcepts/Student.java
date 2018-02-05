package oopsConcepts;

public class Student {
	String name;
	int len;

	public Student(String students) {
		System.out.println("my name is:" + students);
	}

	public Student() {

		System.out.println("hello I am student:");
	}

	public void study() throws Exception {
		try {
			int len = name.length();
			int abc[] = { 1, 2, 23 };
			System.out.println("abc[4]");

			ArithmeticException ae = new ArithmeticException();
			throw ae;
		}  
		catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			System.out.println("length is" + len);
			System.out.println(name + "is studying");
			name = this.getClass().getName();
		}

	}

	public void study(String math) {
		System.out.println("I am studying maths");
	}

	public void study(int countOfSub, String sub) {
		System.out.println("I am studying maths and physics");
	}

	public void study(String sub, int countOfSub) {
		System.out.println("I am studying all");
	}
}
