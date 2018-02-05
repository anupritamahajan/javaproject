package company;

public class Resourses {
	static int empid = 0;

	public void abc() {
		System.out.println("parent class:");
	}

	public Resourses() {

		empid = empid + 1;
		this.abc();
	}
}
