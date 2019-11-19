public class MyMain {
	public static void main(String[] args) {
		//Create an observer window and a controller window.
		//The controller window will be observed.
	ObserverWindow pop = new ObserverWindow();
		new ControllerWindow(pop);
		
	}
}
