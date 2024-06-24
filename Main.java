import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Hello and welcome to the decision maker");
        System.out.println("Please enter how many options you have as an integer");
        int optionInput = input.nextInt();
        input.nextLine();

        String[] optionArray = new String[optionInput];

        for(int i = 0; i < optionInput; i++){
            optionArray[i] = input.nextLine();
        }
        
        int randElement = rand.nextInt(optionArray.length);

        System.out.print(optionArray[randElement]);

    }
}
