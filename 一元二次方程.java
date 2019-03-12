

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m=in.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		int[] c=new int[m];
		double x1,x2;
		for(int i=0;i<m;i++) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
			c[i]=in.nextInt();
		}
		for(int i=0;i<m;i++) {
			double n=Math.pow(b[i], 2)-4*a[i]*c[i];
			if(n>=0) {
				x1=(-b[i]+Math.sqrt(n))/2;
				x2=(-b[i]-Math.sqrt(n))/2;
				if(x1==x2) {
					System.out.printf("x=%.2f\n",x1);
				}
				else {
					System.out.printf("x1=%.2f,x2=%.2f\n",x1,x2);
				}
			}
			else {
				System.out.println("-1");
			}
		}
	}
}
