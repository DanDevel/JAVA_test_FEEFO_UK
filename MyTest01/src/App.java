
import MyCheckNormalizer.Normaliser;

public class App {
    public static void main(String[] args) throws Exception {

        String jt = "Java engineer";
        Normaliser n = new Normaliser();
        
        String normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        System.out.println(normalisedTitle);
        
        jt = "C# engineer";
        normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        System.out.println(normalisedTitle);

        jt = "Accountant";
        normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        System.out.println(normalisedTitle);

        jt = "Chief Accountant";
        normalisedTitle = n.normalise(jt);
        //output normalisedTitle
        System.out.println(normalisedTitle);
        
    }

    

    
}
