package Q01.letra_A;
import java.util.*;

class countWords {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

       String delim = " \t\n.,:;?!-/()[]\"\'";
       String line; 
       int count = 0;
       Set<String> wordSet = new HashSet<String>();

        while (!(line = in.nextLine()).trim().equals("")) {
        
            StringTokenizer st = 
             new StringTokenizer(line, delim); 
        
            while (st.hasMoreTokens()) {
                count++; 
                //System.out.println(st.nextToken().toLowerCase()); 
                wordSet.add(st.nextToken().toLowerCase());
            }
            System.out.println("O número de palavras é: " + count);
            System.out.println("O número de palavras distintas é: "+ wordSet.size());
         }
    }
}