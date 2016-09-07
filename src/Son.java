
public class Son extends Parent {
	public static void main(String[] args) {
		Son son = new Son();
		son.method1();
		son.method2();
	}
}

class Parent{
	
	void method1(){
		System.out.println("default method");
	}
	public void method2(){
		System.out.println("public method");
	}
}