package Launch_Browser;

import java.util.Scanner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runTimePolymorphysm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		sc.close();
		if(inp == 1) {

			new ChromeDriver();
		}
		else if(inp == 2) {
			new EdgeDriver();

		}
		else if (inp == 3) {
			new FirefoxDriver();

		}
		else {
			System.out.println("invalid inp");
		}

	}

}
