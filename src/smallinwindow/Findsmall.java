package smallinwindow;

public class Findsmall {
	
	/* this  function finds the smallest in the window frame with a complexity of O(end) */
	public int findsmall(int arr[],int start, int end){
		int smallest=arr[start];
		for(;start<=end;start++){
//			System.out.println(" start is : "+start+" end is : "+end);
			if(arr[start]<smallest){
				smallest=arr[start];
			}
		}
		return smallest;
	}
}
