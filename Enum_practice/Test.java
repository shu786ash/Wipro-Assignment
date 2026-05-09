package Enum_practice;
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY}
public class Test {
	public static void main(String args[]) {
		Day day = Day.MONDAY;
		switch(day) {
		case MONDAY: System.out.println("Monday"); break;
		case TUESDAY: System.out.println("Tuesday"); break;
		case WEDNESDAY: System.out.println("Wednesday"); break;
		case THURSDAY: System.out.println("Thursday"); break;
		case FRIDAY: System.out.println("Friday"); break;
		case SATURDAY: System.out.println("Saturday"); break;
		case SUNDAY: System.out.println("Sunday"); break;
		}
	}

}
