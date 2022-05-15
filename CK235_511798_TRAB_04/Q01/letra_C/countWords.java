package Q01.letra_C;
import java.util.*;

public class countWords {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        String delim = " \t\n.,:;?!-/()[]\"\'";
        String line; 
        int count = 0;

        TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();

        while (!(line = in.nextLine()).trim().equals("")) {
        
            StringTokenizer st = 
             new StringTokenizer(line, delim); 
        
            while (st.hasMoreTokens()) {
                count++; 
                //System.out.println(st.nextToken().toLowerCase()); 
                String theString = st.nextToken().toLowerCase();
                if ( !wordMap.containsKey(theString) ) {
                    wordMap.put(theString, 1);
                }else{

                    wordMap.replace(theString, wordMap.get(st.nextToken())+1);
                }
            }
            wordMap.forEach(
                (key, value)
                    -> {System.out.println(key + ": " + value);}  
            );
            
         }
    }
}
