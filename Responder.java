import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */

public class Responder
{
    private Random randomGenerator;
    private ArrayList <String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator= new Random();
        responses = new ArrayList<>();
        fillResponses();
    }
    
    private void fillResponses()
    {
        responses.add("yes");
        responses.add("No");
        responses.add("Maybe");
        responses.add("IDK");
        responses.add("ok");
        responses.add("yess");
        responses.add("yesss");
        responses.add("yesssssssss");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
     int i=randomGenerator.nextInt(responses.size());
     return responses.get(i);
    }
}
