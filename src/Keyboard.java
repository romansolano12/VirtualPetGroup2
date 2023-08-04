import java.util.Scanner;

public class Keyboard {
    // created a Scanner named scanner
    Scanner scanner = new Scanner(System.in);

    /**
     * this scanner will take care of user input for int
     * example;
     * int key = input.keyboardInt();
     *
     * @return
     */
    public int keyboardInt() {
        // setting up variables
        int value = 0;
        boolean failedInt = true;
        // will keep looping until condition is false
        while (failedInt) {
            // a string will be collected by user input
            String stringInt = scanner.nextLine();
            // will try out this code
            try {
                // convert the string into an int
                value = Integer.parseInt(stringInt);
                // if successful will change condition to false
                failedInt = false;
            }
            // if user input can not be converted to an int
            catch (NumberFormatException e) {
                // send user message to try again
                System.out.println(stringInt + " is not a valid input please try again");
            }
        }
        // once loop is done it will return the int value needed
        return value;
    }
/**
 * this scanner will take care of user inputs for string and reformat them 
 * example;
 * String key = input.keyboardString();
 * @return
 */
    //
    public String keyboardString(){
        //setting up variable 
        String word;
        //picking up user input as a string 
        word = scanner.nextLine();
        //return word as the first character uppercase and the rest of the words characters as lowercase 
        return word.substring(0, 1).toUpperCase()+word.substring(1, word.length()).toLowerCase();
    }
}
