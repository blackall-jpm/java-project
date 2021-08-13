
//staticness of the variable relates to the memory space it sits in not it’s value. 
//This means that the same variable is accessible from all class instances in which it is referenced.

public class StaticExample {
    static int joe = 27; 
    int mary = 15; 
	public void Output() {
		System.out.println("staticExample...");
		StaticExample a = new StaticExample(); 
		StaticExample b = new StaticExample(); 
        System.out.println("a.joe " + a.joe + ", a.mary" + a.mary); 
        System.out.println("b.joe " + b.joe + ", b.mary" + b.mary); 
        System.out.println("increment a.joe and a.mary"); 
        a.joe += 1; 
        a.mary += 1; 
        System.out.println("a.joe " + a.joe + ", a.mary" + a.mary); 
        System.out.println("b.joe " + b.joe + ", b.mary" + b.mary); 
        System.out.println("increment b.joe and b.mary"); 
        b.joe += 1; 
        b.mary += 1; 
        System.out.println("a.joe " + a.joe + ", a.mary" + a.mary); 
        System.out.println("b.joe " + b.joe + ", b.mary" + b.mary); 
		System.out.println("End staticExample...");
	}

}
