public class Lab20_95{ 
	static void countingSort(int[] arr,int place){
		
		int[] b = new int[10];
		for (int i=0;i<b.length ;i++ ) {
			b[i]=0;
		}
		for(int i=0;i<arr.length; i++){
			b[(arr[i]/place)%10]++;
		}
		for(int i=1;i<b.length; i++){
			b[i] = b[i]+b[i-1];
		}
		int temp[] = new int[arr.length];
		for(int i=arr.length-1;i>=0; i--){
			temp[b[(arr[i]/place)%10]-1] = arr[i];
			b[(arr[i]/place)%10]--;
		}
		for(int i=0;i<temp.length; i++){
			System.out.println(temp[i]);
		}
	}

	public static void radixSort(int[] arr){
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length ;i++ ) {
			max = Math.max(max,arr[i]);
		}
		for (int place=1;(max/place)>0 ;place=place*10 ) {
			countingSort(arr,place);
		}

	}
	public static void main(String[] args) {
		int arr[] = {576,700,58,90,100,222,345,245};
		// countingSort(arr,place);
		radixSort(arr);
	}
}