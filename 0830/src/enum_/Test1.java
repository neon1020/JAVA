package enum_;

public class Test1 {

	public static void main(String[] args) {
		Week week = Week.SAT;
		
		switch (week) {
		case MON:
		case TUE:
		case WED:
		case THU:
			System.out.println("하...");
			break;
		case FRI:
			System.out.println("불금!");
			break;
		case SAT:
		case SUN:
			System.out.println("주말!!");
			break;
		}
	}

}

enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN
}
