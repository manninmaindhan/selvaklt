package Array;

public class RemovingGivenNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {10,20,30,40,50};
int no=30;
for(int i=0;i<a.length;i++) {
	if(no!=a[i]) {
		System.out.println(a[i]);
	}
}

	}

}
