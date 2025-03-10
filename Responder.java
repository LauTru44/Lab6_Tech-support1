import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
    private HashMap <String,String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator= new Random();
        responses = new HashMap<>();
        fillResponsesMap();
    }
    
    private void fillResponsesMap()
    {
     responses.put("hello","bye");
     responses.put("yes","no");
     responses.put("oui","non");
     responses.put("helloo","byee");
    }
    
    private String pickDefaultresponse()
    {
    return "no idea sorry";
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(Set<String> words)
    {  
    for (String word : words) {    
    String answer = responses.get(word);
    
    if (answer!=null){
        return answer;
    }       
    }
    return pickDefaultresponse();
    }
}
