package Q02.letra_D;
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

        Teste_hash2<TreeSet<String>> teste = new Teste_hash2<>();

        Teste_hash2<LinkedHashSet<String>> teste2 = new Teste_hash2<>();

        //teste.listar(mesesHash);
        teste.listar2(mesesHash);

        //teste2.listar(mesesHash);
        teste2.listar2(mesesHash);

        /* Não sei se eu fiz o método listar da maneira correta, mas caso tenha feito, então podemos observar 
        que quando mudamos o tipo do parâmetro o método listar para de funcionar. Por isso deixei comentado */

        
    }
}
