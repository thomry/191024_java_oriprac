package object_oriented;

class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); // static method�� ��ü �������� ȣ�� ����

	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
