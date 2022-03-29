package coreJavaDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder s3 = new StringBuilder("hello");
		StringBuilder s4 = new StringBuilder("hello");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		StringBuffer s5 = new StringBuffer("hello");
		StringBuffer s6 = new StringBuffer("hello");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
//		String s7 = new String("good");
//		s7 = s7.concat("morning");
//		System.out.println(s7);
//		StringBuffer s7 = new StringBuffer("good");
//		s7.append("morning");
//		System.out.println(s7);
		
//		String s8 = new String("hello");
//		String s9 = new String("hello");
//		System.out.println(s8==s9);
//		System.out.println(s8.equals(s9));
	}

}
