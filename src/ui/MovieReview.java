package ui;

public class MovieReview {

	public static void main(String[] args) {
		Display.getIntro("Subjective Movie Reviews", 1, "Christian Hall");
		String quit = "N";
		while (quit.equalsIgnoreCase("N")) {
			String mainMenuChoice = " ";
			while (!mainMenuChoice.equalsIgnoreCase("Q")) {
				mainMenuChoice = Console.menuChoice(Display.getMainMenu(), "MAIN MENU");
			}
			
			quit = Console.menuChoice(Display.getExitMenu(), "REALLY QUIT?");
		}

	}

}
