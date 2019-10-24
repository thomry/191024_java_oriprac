package object_oriented;

class Data { int x; }

class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x    = 10;
		System.out.println("main() : x = "+d.x);	// 10
		
		change(d);
		System.out.println("After cahdnge(d)");
		System.out.println("main() : x = "+d.x);	// 1000

	}
	
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = "+d.x);	// 1000
	}

}
