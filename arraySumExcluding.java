package oopsJavaLab;

public class ArraySum {

	public static void main(String[] args) {
	 
		int arr[]= {10,3,6,1,2,3,4,5,7,10};
		int sum=0;
		int sixPos=-1;
		int sevenPos=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6)
			sixPos=i;
			if(arr[i]==7)
				sevenPos=i;
			}
		if(sevenPos==-1)
			sixPos=-1;
		for(int i=0;i<arr.length;i++) {
	if(sixPos!=-1&&i>=sixPos&&i<=sevenPos)continue;
	sum+=arr[i];
	System.out.println(sum);
		}
		
	}
}
