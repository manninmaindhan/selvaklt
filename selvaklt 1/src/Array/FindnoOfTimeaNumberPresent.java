package Array;

public class FindnoOfTimeaNumberPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,10};
		int no=10;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(no==a[i]) {
				count++;
			}
			
		}
		System.out.println(count);	
	}

}
