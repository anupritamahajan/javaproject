package my1;

import company.Housekeeping;
import company.Resourses;
import company.Technical;
import company.management;
import oopsConcepts.BaseClass;
import oopsConcepts.ChildClass;
import oopsConcepts.ChildClassofInt;
import oopsConcepts.EngStudent;
import oopsConcepts.CompEnggStudent;
import oopsConcepts.FECompEnggStu;
import oopsConcepts.ParentClass;
import oopsConcepts.ParentInterface1;
import oopsConcepts.ParentInterface2;
import oopsConcepts.Student;

public class my1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student Anuja=new Student("Anuja");
		/*ParentInterface2 o1;
		o1=new ChildClassofInt();
		Resourses id1;
		ParentClass obj;
	    obj=new ChildClass();
		id1 = new management();
		id1.abc();*/
		Student Anuja1=new Student();
		Anuja.study();
		//id1 = new Housekeeping();
		//id1 = new Technical();
		//id1 = new management();
		
		/*
		 * BaseClass bc= new BaseClass(); bc.SampleDemo(); BaseClass bc1= new
		 * BaseClass(); BaseClass bc2= new BaseClass(); BaseClass bc3= new BaseClass();
		 */

		/*
		 * Student Anuja = new Student(); Student Anuja1 = new EngStudent(); EngStudent
		 * Anuja2 = new CompEnggStudent(); CompEnggStudent Anuja3 = new FECompEnggStu();
		 * 
		 * Anuja.study(); Anuja2.study(); Anuja3.study();
		 */

		/*
		 * int num=addition(5,5); System.out.println("addition:"+num); int n=sub(10,2);
		 * System.out.println("sub:"+n); int num1=mul(2,3);
		 * System.out.println("mul:"+num1); int n1=div(6,0);
		 * System.out.println("div:"+n1); printnumbers(); sumofArrey();
		 * sumofMulofArrey(); stringReverse(); dispMatrix(); dispArrey();
		 */
	}

	static int addition(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	static int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	static int div(int a, int b) {
		if (b == 0) {
			System.out.println("Devision is " + b);
			return b;
		} else {

			int result = a / b;
			return result;
		}
	}

	static void printnumbers() {
		int number[] = { 10, 2, 3, 9 };
		int len = number.length;
		int i = 0;
		while (i < len) {
			System.out.println(number[i]);
			i++;
		}
	}

	static void sumofArrey() {
		int num[] = { 1, 2, 3, 4 };
		int sum = 0;
		int len = num.length;
		int i = 0;
		for (i = 0; i < len; i++) {

			sum = sum + num[i];
		}
		System.out.println("sum is :" + sum);
	}

	static void sumofMulofArrey() {
		int num[] = { 1, 2, 3, 4 };
		int result = 0;
		int len = num.length;
		int i = 0;
		for (i = 0; i < len; i++) {
			result = result + i * num[i];
		}
		System.out.println("Result is:" + result);
	}

	static void stringReverse() {
		String name = "Hi";
		int len = name.length();
		int i;
		for (i = len - 1; i >= 0; i--) {
			char letter = name.charAt(i);
			System.out.print(letter);
		}
	}

	static void dispMatrix() {
		int i = 0, j = 0, k = 1;
		for (j = 0; j <= 2; j++) {
			// System.out.println(1);
			System.out.println(" ");

			for (i = 0; i <= 2; i++) {
				System.out.print(k * 5);
				System.out.print(" ");
				k++;
			}
			k--;
			k = k + k;
		}
	}

	static void dispArrey() {
		int arr[] = { 2, 10, 3, 1, 5, 12, 4 };
		int len;
		len = arr.length;
		int j, i, val = 0;

		for (j = 0; j < len; j++) {
			if (j < len - 1) {
				val = arr[j] + arr[j + 1];
				for (i = 0; i < len; i++) {
					if (arr[i] == val) {
						System.out.println(val + "is present at " + i);
					}

				}

			}
		}
	}

}