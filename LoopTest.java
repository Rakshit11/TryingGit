package customGit;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;


public class LoopTest {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner (System.in);
		int n = sc.nextInt();
		int k =  sc.nextInt();
		int count = 0;
		while(n-->0) {
			int x = sc.nextInt();
			if(x%k==0)
				count++;
		}
		System.out.println(count);
		
	}
}
