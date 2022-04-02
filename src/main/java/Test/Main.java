package Test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome to maximum problem");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of paramaters range 3-5");
		int option = scanner.nextInt();
		switch (option) {
		case 3:
			TestMaximum testmaximum = new TestMaximum(2, 1, 3);
			testmaximum.findMaximum(2, 1, 3);

			TestMaximum testmaximum2 = new TestMaximum(3.8f, 1.7f, 2.8f);
			testmaximum2.findMaximum(3.8f, 1.7f, 2.8f);

			TestMaximum testmaximum3 = new TestMaximum("Mango","Pineapple","Kiwi");
			testmaximum3.findMaximum("Mango","Pineapple","Kiwi");
			break;

		case 4:
			TestMaximum testmaximum4 = new TestMaximum(2, 1, 3,4);
			testmaximum4.findMaximum(2, 1, 3, 4);

			TestMaximum testmaximum5 = new TestMaximum(3.8f, 1.7f, 2.8f,5.6f);
			testmaximum5.findMaximum(3.8f, 1.7f, 2.8f,5.6f);

			TestMaximum testmaximum6 = new TestMaximum("Mango","Pineapple","Kiwi","orange");
			testmaximum6.findMaximum("Mango","Pineapple","Kiwi","orange");
			break;
			
		case 5:
			TestMaximum testmaximum7 = new TestMaximum(2, 1, 3,4,9);
			testmaximum7.findMaximum(2, 1, 3, 4,9);

			TestMaximum testmaximum8 = new TestMaximum(3.8f, 1.7f, 2.8f,5.6f,9.0f);
			testmaximum8.findMaximum(3.8f, 1.7f, 2.8f,5.6f,9.0f);

			TestMaximum testmaximum9 = new TestMaximum("Mango","Pineapple","Kiwi","orange","apple");
			testmaximum9.findMaximum("Mango","Pineapple","Kiwi","orange","apple");
			break;
			
			

		}

	}

}
