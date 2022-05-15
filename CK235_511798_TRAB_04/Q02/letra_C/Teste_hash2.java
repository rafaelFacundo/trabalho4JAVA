package Q02.letra_C;
import java.util.*;

class Teste_hash2<T>{

    Set<String> a;
    
    Teste_hash2() {
        this.a = new HashSet<>();
    }

    void listar (T list) {
        Iterator<String> a =  ((Set<String>)list).iterator();
        while(a.hasNext()) {
            System.out.println(a.next());
        }
    }

    void listar2 (Collection c) {
        System.out.println("***Listar 2***");
        for (Object o : c) {
            System.out.println(o);
        }
    }

   /*  public static void main(String args[]) {
        Set<String> mesesHash = new HashSet<>();

        mesesHash.add("Janeiro");
        mesesHash.add("Fevereiro");
        mesesHash.add("Março");
        mesesHash.add("Abril");
        mesesHash.add("Maio");
        mesesHash.add("Fevereiro");
    
        System.out.println("HashSet: ");
        
    } */

   




}
