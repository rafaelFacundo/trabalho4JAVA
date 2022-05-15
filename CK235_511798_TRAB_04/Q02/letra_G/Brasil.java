package Q02.letra_G;
import java.util.HashMap;

class Brasil {
    public static void main(String args[]) {
        HashMap<String, String> estados = new HashMap<>();

        estados.put("CE", "Ceará");
        estados.put("SP", "São Paulo");
        estados.put("Rj", "Rio de Janeiro");
        estados.put("ES", "Espirito Santo");
        estados.put("BA", "Bahia");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("PE", "Pernambuco");
        estados.put("AL", "Alagoas");
        estados.put("MA", "Maranhão");
        estados.put("AM", "Amazonas");
        estados.put("AC", "Acre");
        estados.put("TO", "Tocantis");
        estados.put("RO", "Roraima");
        estados.put("GO", "Goiás");
        estados.put("MT", "Mato grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("SE", "Sergipe");
        estados.put("PI", "Piauí");
        estados.put("PA", "Pará");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("PR", "Paraná");
        estados.put("SC", "Santa Catarina");
        estados.put("MG", "Minas Gerais");
        estados.put("PB", "Paraíba");

        String sigla = args.toString();

        if ( estados.containsKey(sigla) ) {
            System.out.print(estados.get(sigla));
        }else {
            System.out.println("Sigla não encontrada.");
        }






    }    
}
