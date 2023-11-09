package practise;

import java.util.Random;

public class radomnum {
public static void main(String[] args) throws InterruptedException {

	for(int i=0;i<15;i++) {
		
	
	
	Random random = new Random();

	int num=random.nextInt(65, 90);
	int num2=random.nextInt(65, 90);
	int num3=random.nextInt(65, 90);
	char ch = (char) num;
	char ch2 = (char) num2;
	char ch3 = (char) num3;
	System.out.println(ch+""+ch2+""+ch3);
	System.out.println(num);
Thread.sleep(2000);	
}
}
}