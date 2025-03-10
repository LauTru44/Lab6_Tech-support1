import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;
/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
/* 34. Hashset doesnt store the objects in a specific order, doesnt allow duplicates.
 * 35. ponctuation and spaces
 * 37. Returning words in a HashSet removes duplicates and does not maintain order, 
 * while an ArrayList keeps duplicates and preserves insertion order.
 * 
 * 
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine().trim().toLowerCase(); //removes spaces and turns it to lowercase
        String [] wordArray = inputLine.split(" "); //puts each word in an array, it is separated by spaces
        
        HashSet<String> words = new HashSet<String>();//creates a hashset 
        for (String word : wordArray){
         words.add(word);  //for each to store the words of the array into the hashset 
        }
        return words;
    }
}
