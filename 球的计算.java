import java.util.Scanner;

class Yuan{
	double x;
	double y;
	double z;
	public Yuan(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	public double getz() {
		return z;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		Yuan[] a=new Yuan[m];
		Yuan[] b=new Yuan[m];
		double[] r=new double[m];
		double[] V =new double[m];
		for(int i=0;i<m;i++) {
			double x=in.nextDouble();
			double y=in.nextDouble();
			double z=in.nextDouble();
			a[i]=new Yuan(x,y,z);
		}
		for(int i=0;i<m;i++) {
			double x=in.nextDouble();
			double y=in.nextDouble();
			double z=in.nextDouble();
			b[i]=new Yuan(x,y,z);
		}
		for(int i=0;i<m;i++) {
			r[i]=Math.sqrt(Math.pow(b[i].x-a[i].x, 2)+Math.pow(b[i].y-a[i].y, 2)+Math.pow(b[i].z-a[i].getz(), 2));
//			r[i]=Math.sqrt(r[i]);
		}
		for (int i=0;i<m;i++) {
			V[i]=(double)4/3*Math.PI*Math.pow(r[i], 3);
		}
//		for(Yuan k : a) {
//			System.out.println(k.getx());
//			System.out.println(k.gety());
//			System.out.println(k.getz());
//		System.out.println(r[i]);
//		}
//		double v=0;
		for (int i=0;i<m;i++) {
			System.out.printf("%.2f %.2f\n",r[i],V[i]);
//			System.out.printf("%.2f",V[i]);
//			System.out.println(v=(double)4/3*Math.PI*Math.pow(2.24, 3));
		}
	}
}
