import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[] x= new int[m];
		long y = 1;
		int i =0;
		for(i=0;i<m;i++) {
			x[i] = in.nextInt();
		}
		for(int j=0;j<m;j++) {
			int k= x[j];
			for (i = 0;i<k;i++) {
				y=y*x[j];
				x[j]--;
			}
			System.out.println(y);
			y=1;
		}
	}

}
