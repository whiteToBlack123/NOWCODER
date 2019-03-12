

import java.util.Scanner;
//import java.awt.*;

class Jiao{
	Jiao(double[] a,double[] b,int m ){
		double[] c=new double[m];
		for(int i=0;i<m;i++) {
			c[i]=a[i]-b[i];
//			c[i]=Math.abs(c[i]);
			c[i]=Math.toRadians(c[i]);
			c[i]=Math.sin(c[i]);
		}
		for(int i=0;i<m;i++) {
			System.out.printf("%.2f ",c[i]);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		double[] a=new double[m];
		double[] b=new double[m];
		for (int i=0;i<m;i++) {
			a[i]=in.nextDouble();
			b[i]=in.nextDouble();
		}
		Jiao c=new Jiao(a,b,m);
	}
}
