package ui;

import java.util.ArrayList;
import java.util.List;

public class Display {
	final static int WIDTH = 50;

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
	
	public static void getIntro(String title, double version, String author) {
		int idx = 0;
		title = " " + title + " ";
		while (title.length() <= WIDTH) {
			idx ++;
			if (idx % 2 == 0) {
				title = title + "_";
			} else {
				title = "_" + title;
			}
		}
		System.out.println(title);
		String printversion = " version " + version;
		while (printversion.length() <= WIDTH) {
			printversion = "-" + printversion;
		}
		System.out.println(printversion);
		author = " " + author;
		while (author.length() <= WIDTH) {
			author = "-" + author;
		}
		System.out.println(author);
		System.out.println();
	}


}
