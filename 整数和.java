import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[] x= new int[m];
		int y=0;
		int i=0;
		for (i=0;i<m;i++) {
			x[i] = in.nextInt();
		}
		
		for(int j =0;j<m;j++) {
			if(x[j]>=0) {
				for(i = x[j];i<=2*x[j];i++) {
					y = y+i;
				}
				System.out.println(y);
				y = 0;
			}
			else {
				for (i = x[j];i>=2*x[j];i--) {
					y = y+i;
				}
				System.out.println(y);
				y = 0;
			}

		}
	}

}
