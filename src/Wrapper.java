
public class Wrapper {

	public static void main(String[] args) {
		System.out.println("public static void main(String[] args)");
		//Scanner
		//ScannerExamples scannerObj = new ScannerExamples();
		//scannerObj.Output();
		//Maths
		//MathExamples mathObj = new MathExamples(); 
		//mathObj.Output();
		//static
		//StaticExample staticObj = new StaticExample(); 
		//staticObj.Output();
        //While
		//WhileExample whileObj = new WhileExample(); 
		//whileObj.Output();
		//Time 1
		TimeEgs timeObj = new TimeEgs();
		System.out.println(timeObj.toMilitary());
		timeObj.setTime(13, 27, 6);
		System.out.println(timeObj.toMilitary());
		System.out.println(timeObj.toOrdinaryTime());
	}

}
