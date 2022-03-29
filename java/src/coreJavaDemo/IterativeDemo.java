package coreJavaDemo;

public class IterativeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		while(a<5) {
			System.out.println(a);
			a++;
		}
		int b = 7;
		do{
			System.out.println("do while"+b);
			b++;
		}
		while(b<5);
		
		for(int i = 0; i<9;i++) {
			if(i == 5) {
				continue;	 // break and coninue 
			}
			System.out.println("i" +i);
		}
		
	}

}
