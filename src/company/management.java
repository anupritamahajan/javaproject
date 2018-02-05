package company;

public class management extends Resourses {

	public void abc() {
		System.out.println("child class");
		//super.abc(); // from parent class
		//this.abc(); // from the same class
	}

	public management() {
		super();
		System.out.println("I am Manager!" + empid);
	}

}
