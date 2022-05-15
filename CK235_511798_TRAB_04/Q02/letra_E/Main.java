package Q02.letra_E;
import java.util.*;

public class Main {
    public static void main (String args[]) {
        Set<String> mesesHash = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        list.add("Rafael");
        list.add("Facundo");
        list.add("da");
        list.add("Costa");

        ClasseE<HashSet<String>> teste = new ClasseE(mesesHash, list);
    }
}
