import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nameLength = 0;
        String maxName = null;
        while (true) {
            System.out.println("Enter a name with a capital letter: ");
            String input = sc.nextLine();

            if (input.equals("end")) {
                System.out.println("The program is finished!");
                break;
            } else if (!Character.isUpperCase(input.charAt(0))) {
                System.out.println("Names should be entered with a capital letter\n");
            } else if (nameLength == 0) {
                maxName = input;
                nameLength = maxName.length();
                System.out.println("It is the first name you entered!\n");
            } else if (nameLength < input.length()) {
                nameLength = input.length();
                maxName = input;
                System.out.println("This name " + maxName + " is longest name!\n");
            } else {
                int maxNameLength = nameLength - input.length();
                System.out.println("The longest name is " + maxName + " was not enough " + maxNameLength + " characters\n");
            }
        }
    }
}
