package raghusir.assignment;

public class ArrayShort {
	
	public static void main(String[] args) {
		ArrayShort as=new ArrayShort();
		int arr[]={56,85,2,41,12,3,98,4,1};
		int[] res=as.sortArray(arr);
		for(int g:res){
		System.out.println(g);
		}
	}
	int[] sortArray(int [] a){
		for(int i=0;i<a.length-1;i++){
			int index=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[index]){
					index=j;
				}
			}
			int smallerNumber=a[index];
			a[index]=a[i];
			a[i]=smallerNumber;
		}
		return a;
	}
}
