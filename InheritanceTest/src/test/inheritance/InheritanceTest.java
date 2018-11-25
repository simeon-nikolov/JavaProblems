package test.inheritance;

class A {
	public A() {
		System.out.println("A");
	}
}

class B extends A {
	public B() {
		System.out.println("B");
	}
}

class C extends B {
	public C() {
		System.out.println("C");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		new C();
	}

}

/*
 * Output:
 * A
 * B
 * C
 * 
 */
