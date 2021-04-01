package OOPExercise; //edition

	public class Smartwatch {
		
		String model[] = {"Versa 2", "Vivosmart HR", "Traverse"};
		String color[] = {"Rose gold", "Midnight Blue", "White"};
		String brand[] = {"Fitbit", "Garmin", "Suunto"};
		
		int calling = 9;
		String bluetooth = "Bluetooth is connected. ";
		String touchscreen = "Yes. The screen can be touch.";
		String detect[] = {"the number of calories burn and walking step", "activities as running, watersports such as heart rate", "as countdown timer"};
		String messaging = "Yes. It allow to text";
		
		void printMethod() {//method of smartwatch
			System.out.println("Press "+ calling + " for emergency call 999");
			System.out.println(bluetooth);
			System.out.println(messaging);
			System.out.println(touchscreen);
		}
}
