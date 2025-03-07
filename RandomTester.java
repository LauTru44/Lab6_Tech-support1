import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;
    private ArrayList <String> responses;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        randomGenerator= new Random();
        responses = new ArrayList<>();
        fillresponses();
    }
     
    public void printRandom()
    {
        System.out.println("New random number "+randomGenerator.nextInt());
    }
    
    public void printMultiRandom(int howMany)
    {
        int index=0;
        while (index<howMany){
            printRandom();
            index++;
        }
    }
    
    private void fillresponses()
    {
        responses.add("yes");
        responses.add("No");
        responses.add("Maybe");
        responses.add("IDK");
        responses.add("ok");
        responses.add("yess");
    }
    
    public String getResponse()
    {
     int i=randomGenerator.nextInt(responses.size());
     return responses.get(i);
    }
    
    
}
