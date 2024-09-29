import java.util.Scanner;

// Class for Problem 3: PartyAffiliation
class Problem3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their party affiliation
        System.out.print("Enter your party affiliation (D, R, or I): ");
        String party = in.next().toUpperCase(); // Read input and convert it to uppercase

        // Cascaded if-else for party affiliation
        if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}