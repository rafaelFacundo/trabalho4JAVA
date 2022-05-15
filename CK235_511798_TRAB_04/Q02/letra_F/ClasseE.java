package Q02.letra_F;

import java.util.*;

public class ClasseE<T>{
    
    void verificar (Collection list) {
        if ( list instanceof Set ) {
            System.out.println("Permite a inclusão de elementos duplicados.");
            
        }
        if ( list instanceof SortedSet ) {
            System.out.println("Ordena automaticamente os elementos.");
        }
        if ( list instanceof List  ) {
            System.out.println("garante a ordem de entrada dos elementos na coleção.");
        }
    }

    public ClasseE (Collection list, ArrayList<String> listOfString ) {
        this.verificar(list);
        listOfString.forEach(
            (arg0)
                -> {list.add(arg0);}        
        );
        System.out.println(list);
    }

    
}
