import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {

    static Scanner scanner = new Scanner(System.in);
    Map<String, String> players = new HashMap<>();

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.run();
    }

    public void run() {

        boolean stay = true;

        while (stay) {
            System.out.println("Welcome to the Scramble Tracker");
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("(1) Player Entry");
            System.out.println("(2) Score Entry");
            System.out.println("(3) Finish Round");

            if (scanner.nextLine().equals("1")) {
                players = playerEntry();

            } else if (scanner.nextLine().equals("2")) {
                scoreEntry();

            } else if (scanner.nextLine().equals("3")) {
                stay = false;

            }
        }
    }

    public Map<String, String> playerEntry() {

        Map<String, String> players = new HashMap<>();

        System.out.println("Please enter in Player A's name: ");
        String playerA = scanner.nextLine();
        players.put("A", playerA);
        System.out.println("Please enter in Player B's name: ");
        String playerB = scanner.nextLine();
        players.put("B", playerB);
        System.out.println("Please enter in Player C's name: ");
        String playerC = scanner.nextLine();
        players.put("C", playerC);
        System.out.println("Please enter in Player D's name: ");
        String playerD = scanner.nextLine();
        players.put("D", playerD);

        return players;
    }

    public void scoreEntry() {

        System.out.println("Please select a hole: ");

        if (Integer.parseInt(scanner.nextLine()) > 0 && Integer.parseInt(scanner.nextLine()) <= 18) {
            int hole = Integer.parseInt(scanner.nextLine());
            
        } else {
            System.out.println("Invalid entry");
        }
    }


}

