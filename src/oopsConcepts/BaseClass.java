package oopsConcepts;

public class BaseClass {
	static int id =0;
	
	public BaseClass() {
		System.out.println("I am in Constructor with int");
		id=id+1;
		System.out.println("value of id:"+id);
	}
	public BaseClass(int count) {
		System.out.println("I am in Constructor with int" + count );
	}
	public BaseClass(float count) {
		System.out.println("I am in Constructor with float"+ count);
	}
	public BaseClass(int count,float count123) {
		System.out.println("I am in Constructor with int and float"+ count +""+ count123 );
	}
	public BaseClass(float count123,int count) {
		System.out.println("I am in Constructor with int and float"+ count +""+ count123 );
	}
	
	public void SampleDemo() {
		System.out.println("In sample Demo:");
		
	}

}
