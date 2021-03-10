package ui;

public class MovieReview {

	public static void main(String[] args) {
		Display.getIntro();
		String quit = "N";
		while (quit.equalsIgnoreCase("N")) {
			String mainMenuChoice = " ";
			while (!mainMenuChoice.equalsIgnoreCase("Q")) {
				mainMenuChoice = Display.menuChoice(Display.getMainMenu(), "MAIN MENU");
			}
			
			quit = Display.menuChoice(Display.getExitMenu(), "REALLY QUIT?");
		}

	}

}
