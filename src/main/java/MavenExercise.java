import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        if(StringUtils.isNumeric(input)){
            System.out.println("That is a number");
        } else {
            System.out.println("That is not a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }//end of main
}//end of Maven
