import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to the decision maker");
        System.out.println("Please enter how many options you have as an integer");
        int optionInput = input.nextInt();

        String[] optionArray = new String[optionInput];

        for(int i = 0; i < optionInput; i++){
            optionArray[i] = input.nextLine();
        }

        for(int i = 0; i < optionInput; i++){
           System.out.println(optionArray[i]);
        }

    }
}