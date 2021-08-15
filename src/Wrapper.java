import java.util.EnumSet;

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
		//TimeEgs timeObj = new TimeEgs();
		//System.out.println(timeObj.toMilitary());
		//timeObj.setTime(13, 27, 6);
		//System.out.println(timeObj.toMilitary());
		//System.out.println(timeObj.toOrdinaryTime());
		
		// toString using this & constructor
		//ToStringEgs toStrObj = new ToStringEgs(4,5,6);
		
		//Enum 
		//for (EnumEgs carsObj: EnumEgs.values())
		//	System.out.printf("%s\t%s\t%s\n", carsObj, carsObj.getColour(), carsObj.getCC());
		//System.out.println("\nAnd now for the range of constants\n");
		//for (EnumEgs carsObj: EnumSet.range(EnumEgs.merc, EnumEgs.bmw))
		//	System.out.printf("%s\t%s\t%s\n", carsObj, carsObj.getColour(), carsObj.getCC());

		//json 1
		JSONReadFromAFile jsonReadObj = new JSONReadFromAFile();
		jsonReadObj.methodOutput();
	}

}
