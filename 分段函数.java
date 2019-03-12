import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double y=0;
		int m =in.nextInt();
		double[] x = new double[m]; 
		for (int i =0; i<m; i++) {
		x[i] =in.nextDouble();
		}
		for(int i =0 ;i<m; i++) {
			if(0<=x[i]&&x[i]<2) {
				y = -x[i]+2.5;
			}
			else if(2<=x[i]&&x[i]<4) {
				y= 2-1.5*(x[i]-3)*(x[i]-3);
			}
			else if(4<=x[i]&&x[i]<6) {
				y = x[i]/2-1.5;
			}
			System.out.printf("y=%.1f\n" , y);
		}
	}
}
