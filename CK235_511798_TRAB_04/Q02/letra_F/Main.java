package Q02.letra_F;
import java.util.*;

public class Main {
    public static void main (String args[]) {
        Set<String> mesesHash = new HashSet<>();
        Set<String> mesesHash2 = new TreeSet<>();
        Set<String> mesesHash3 = new LinkedHashSet<>();
        ArrayList<String> mesesHash4 = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();

        list.add("Rafael");
        list.add("Facundo");
        list.add("da");
        list.add("Costa");

        ClasseE<HashSet<String>> teste = new ClasseE(mesesHash, list);
        ClasseE<HashSet<String>> teste1 = new ClasseE(mesesHash2, list);
        ClasseE<HashSet<String>> teste2 = new ClasseE(mesesHash3, list);
        ClasseE<HashSet<String>> teste3 = new ClasseE(mesesHash4, list);

    }
}
