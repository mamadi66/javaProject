package upmc.game;

import java.util.Optional;
import java.util.Scanner;

public class MainMenu {
	Scanner console = new Scanner(System.in);
	static int NUM_MENU_ENTRIES = 3;
	MenuTools tools = new MenuTools();
	
	public MainMenu() {}
	
	public void start() {
		welcomeMsg();
		int choice = chooseMenu();
    System.out.println("\nL'utilisateur a choisi : \"" + choice + "\"");
		byeMsg();
	}
	
	public int chooseMenu() {
		boolean success = false;
		Optional<Integer> menu = Optional.empty();
		while(!success) {
			inviteUserMenu();
			String choice = console.nextLine();
			menu = tools.parseMenuChoice(choice);
			if (menu.isPresent()) {
			  success = tools.verifyMenuChoice(menu.get(), NUM_MENU_ENTRIES);
			}
		}
		return menu.get();
	}

	private void inviteUserMenu() {
	  System.out.print("Veuillez entrer un choix : ");
	  System.out.flush();
	}
	
	private void welcomeMsg() {
	  System.out.println("C'est le jeu de la bataille!\n");
	}
	
	private void byeMsg() {
	  System.out.println("C'est terminé :-(\n\nIl n'y a pas beaucoup de fonctionnalités...");
	}
}
