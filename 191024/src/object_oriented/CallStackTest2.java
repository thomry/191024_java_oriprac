package object_oriented;

class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���."); // 1
		firstMethod();										 // 2
		System.out.println("main(String[] args)�� ������.");	 // 8

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���.");		 // 3
		secondMethod();										 // 4
		System.out.println("firstMethod()�� ������.");			 // 7
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()�� ���۵Ǿ���.");		 // 5
		System.out.println("secondMethod()�� ������.");		 // 6
	}

}
