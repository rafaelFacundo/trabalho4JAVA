package Q02.letra_C;
import java.util.*;

class Teste_Hash {
    public static void main(String args[]) {
        Set<String> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");

        System.out.println("HashSet: ");
        //System.out.println(mesesHash);

        Teste_hash2<Set<String>> teste = new Teste_hash2<>();

        teste.listar(mesesHash);
        teste.listar2(mesesHash);

        /* Aparentemente, não existe nenhuma diferença na hora de printar os nomes dos meses
        O que muda é apenas a forma como o método é construído. */
    }
}
