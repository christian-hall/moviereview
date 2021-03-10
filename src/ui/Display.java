package ui;

import java.util.ArrayList;
import java.util.List;

public class Display {

	public static void getIntro() {
		System.out.println("------------ Christian's Movie Reviews ------------");
		System.out.println("----------------------------------------version 1.0");
		System.out.println();
	}

	public static List<String> getMainMenu() {
		List<String> mainMenu = new ArrayList<>();
		mainMenu.add("Z - LIST ALL MOVIES ALPHABETICALLY");
		mainMenu.add("S - LIST ALL MOVIES BY SCORE");
		mainMenu.add("G - LIST ALL MOVIES BY GRADE");
		mainMenu.add("A - ADD A NEW MOVIE");
		mainMenu.add("D - DELETE A MOVIE BY ID");
		mainMenu.add("E - EDIT A MOVIE BY ID");
		mainMenu.add("Q - QUIT");
		return mainMenu;
	}

	public static List<String> getExitMenu() {
		List<String> exitMenu = new ArrayList<>();
		exitMenu.add("Y - YES");
		exitMenu.add("N - NO");
		return exitMenu;
	}

	public static String menuChoice(List<String> options, String title) {
		// dynamically create a menu with a border and a prompt at the bottom
		final int MAX_LENGTH = 50;
		int idx = 0;
		title = " " + title + " ";
		while (title.length() <= MAX_LENGTH) {
			idx++;
			if (idx % 2 == 0) {
				title = title + "_";
			} else {
				title = "_" + title;
			}
		}
		System.out.println(title);
		for (String choice : options) {
			choice = "| " + choice;
			while (choice.length() < MAX_LENGTH) {
				choice = choice + " ";
			}
			if (choice.length() <= MAX_LENGTH) {
				choice = choice + "|";
			}
			System.out.println(choice);
		}
		String closing = "-";
		while (closing.length() <= MAX_LENGTH) {
			closing = closing + "-";
		}
		System.out.println(closing);
		return Console.getString("Enter selection: ", true);
	}

}
