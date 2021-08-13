import java.util.Scanner;

public class WhileExample {
    static int joe = 27; 
    int mary = 15; 
	public void Output() {
		System.out.println("WhileExample...");
		Scanner scanin = new Scanner(System.in);
		int grade = 0;
		int total = 0;
		int average;
		int counter = 0;
		final int MAX = 4;
		
		System.out.println("Input " + MAX +" times...");
		while (counter < MAX) {
			grade = scanin.nextInt();
			total = total + grade;
			counter++;
			System.out.println("counter=" + counter + " Total=" + total + " Grade=" + grade);
		}
		average = total/4;
		System.out.println("Your average is " + average);
		scanin.close();
	}

}
