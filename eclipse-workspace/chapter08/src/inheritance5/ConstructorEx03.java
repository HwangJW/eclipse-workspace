package inheritance5;

class A {
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수생성자 A");
	}
	public A(int x, int y) {
		System.out.println("매개변수 생성장 2개 A");
	}
}

class B extends A {
	public B() {
		//super();		// super : 슈퍼클래스(부모클래스), 부모클래스의 생성자 호출, 반드시 첫번째 라인.
		System.out.println("생성자 B");	
	}
	public B(int x) {
		super();
		//super(10);
		//super(10,20);
		System.out.println("매개변수생성장 B");
	}
}

public class ConstructorEx03 {

	public static void main(String[] args) {
			
		B b;
		b = new B(5);
		
	}

}
