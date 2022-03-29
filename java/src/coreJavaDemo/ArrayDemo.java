package coreJavaDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2);
		int[] a = new int[5];
		a[3]= 20;
		a[0]= 40;
		//		a[7]= 100; // array index out of bound exception
	}
	static int  add(int a,int b) {
		System.out.println(a+b);
		return a+b;

	}

}
