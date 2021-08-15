
public class ToStringEgs {
	private int month;
	private int day;
	private int year;

	public ToStringEgs (int m,int d, int y) {
		month = m;
		day = d;
		year = y;
		System.out.printf("Constructor is %S\n", this); // will call toString below
	}
public String toString() {
	return String.format("%d/%d/%d", month,day,year);
}
}
