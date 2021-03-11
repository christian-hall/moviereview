package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class MovieReview {

	public static void main(String[] args) {

		Display.getIntro("Subjective Movie Reviews", 1, "Christian Hall");
		String quit = "N";

		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/moviereview";
		String username = "moviereview_user";
		String password = "sesame";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException sqlex) {
			throw new Error("Error: ", sqlex);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (connection == null) {
				System.out.println("\nERROR! FAILED TO ESTABLISH DATABASE CONNECTION");
				quit = "Y";
			}
		}

		while (quit.equalsIgnoreCase("N")) {
			String mainMenuChoice = " ";
			while (!mainMenuChoice.equalsIgnoreCase("Q")) {
				mainMenuChoice = Console.menuChoice(Display.getMainMenu(), "MAIN MENU");
				if (mainMenuChoice.equalsIgnoreCase("Z")) {
					System.out.println("\nListing movies in aphabetical order\n");
				} else if (mainMenuChoice.equalsIgnoreCase("S")) {
					System.out.println("\nListing all movies by score\n");

				} else if (mainMenuChoice.equalsIgnoreCase("T")) {
					System.out.println("\nListing top 10 movies\n");

				} else if (mainMenuChoice.equalsIgnoreCase("A")) {
					System.out.println("\nAdding a new movie\n");

				} else if (mainMenuChoice.equalsIgnoreCase("D")) {
					System.out.println("\nDeleting a movie\n");

				} else if (mainMenuChoice.equalsIgnoreCase("E")) {
					System.out.println("\nEditing a movie\n");

				} else if (mainMenuChoice.equalsIgnoreCase("Q")) {
					break;

				} else {
					System.out.println("\nERROR, NOT A VALID CHOICE\n");
				}

			}

			quit = Console.menuChoice(Display.getExitMenu(), "REALLY QUIT?");
		}

		System.out.println("Goodbye");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
