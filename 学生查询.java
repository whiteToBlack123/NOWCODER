import java.util.Scanner;

class Student{
	String sex="";
	int a=0;
	String name="";
	int age=0;
	public Student(int a, String name,String sex, int age) {
//		super();
		this.a = a;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public int geta() {
		return a;
	}
	public String getname() {
		return name;
	}
	public String getsex() {
		return sex;
	}
	public int getage() {
		return age;
	}
	
}
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m =in.nextInt();
		int n =in.nextInt();
		int y=0;
		Student[] x=new Student[n];
		for(int i=0;i<n;i++) {
			int a=in.nextInt();
			String name=in.next();
			String sex=in.next();
			int age=in.nextInt();
			x[i]=new Student(a, name,sex, age);
		}
		y=in.nextInt();
		for(int i=0;i<n;i++) {
			if(y==x[i].a) {
			System.out.println(x[i].a+" "+x[i].name+" "+x[i].sex+" "+x[i].age);	
			}
		}
//		for(Student k: x) {
//			System.out.println(k.a);
//			System.out.println(k.name);
//			System.out.println(k.sex);
//			System.out.println(k.age);
//		}
//		for(int i=0;i<m;i++) {
//			System.out.println("a="+x[i].a);
//			System.out.println("name="+x[i].name);
//			System.out.println("sex="+x[i].sex);
//			System.out.println("age="+x[i].age);
//		}
	}
}
