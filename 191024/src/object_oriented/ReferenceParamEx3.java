package object_oriented;

class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);	// 배열 모든 요소출력
		sortArr(arr);	// 배열 정렬
		printArr(arr);	// 정렬 후 결과 출력
		System.out.println("sum="+sumArr(arr));	// 배열 총합 출력
	}
	
	static void printArr(int[] arr) {	// 배열 모든 요소 출력
		System.out.print("[");
		for (int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {	// 배열 모든 요소 합 반환
		int sum = 0;
		for (int i = 0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	static void sortArr(int[] arr) {	// 배열 오름차순으로 정렬
		for (int i=0; i<arr.length-1; i++)
			for (int j=0; j<arr.length-1-i;j++)
				if(arr[j] > arr[j+1]) {
					int tmp  = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = tmp;
				}
	}

}
