
/*
 * static可以修饰内部类
*/
public class StaticClass {
	public static void main(String[] args) {
		Test.Indoor indoor = new Test.Indoor();
		indoor.i = 5;
	}

}

class Test{
	static class Indoor{
		Indoor(){
			System.out.println("============= 我是一个内部类'InnerClass' =============");
			System.out.println(i);
		}
		int i = 0;
		public void invoke() {
			System.out.println(i);
		}
	}
}