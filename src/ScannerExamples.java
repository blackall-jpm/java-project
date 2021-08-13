import java.util.Scanner;

public class ScannerExamples {
	public void Output() {
		System.out.println("ScannerExamples...");
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Input int N=");
		int N = scanIn.nextInt();
		System.out.println("int N=" + N);
		scanIn.close();
	}
}
