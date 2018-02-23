

import java.util.Scanner;


public class MainMenu {
	boolean exit;

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		menu.runMenu();
	}

	public static void MainMenu() {

	}

	public void runMenu() {

		printHeader();
		while (!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}

	private void performAction(int choice) {
		switch (choice) {
		case 0:
			exit = true;
			System.out.println("Thank you for using my menu.");
			break;
		case 1:
			System.out.println("You selected 1");
			break;
		case 2:
			System.out.println("You selected 2");
			break;
		default:
		}
	}

	private int getInput() {
		Scanner input = new Scanner(System.in);

		int choice = -1;
		while (choice < 0 || choice > 2) {

			try {
				System.out.print("\nEnter your choice: ");
				choice = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection. Pleace try again.");
			}
		}
		return choice;
	}

	private void printHeader() {
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                        Welcome to                       |");
		System.out.println("|                       My Main Menu                      |");
		System.out.println("+---------------------------------------------------------+");
	}

	private void printMenu() {
		System.out.println("\nPlaese Make A Selection");
		System.out.println("Selection 1");
		System.out.println("Selection 2");
		System.out.println("Exit 0");
	}
}
