package object_oriented;

class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); // static method는 객체 생성없이 호출 가능

	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
