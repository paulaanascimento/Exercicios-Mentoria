
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collections colecoes = new Collections();

        System.out.println("\n----- 1 -----");
        List<Integer> listaInteiros = colecoes.retornaListaNumerosInteiros();

        for(int i = 0; i < listaInteiros.size(); i++){
            if(listaInteiros.get(i) % 2 == 0){
                listaInteiros.remove(listaInteiros.get(i));
            }
        }

        System.out.println(listaInteiros);

        System.out.println("\n----- 2 -----");
        HashMap<String, Integer> nomeIdade = colecoes.guardarNomeIdade();

        for (HashMap.Entry<String, Integer> valor : nomeIdade.entrySet()) {
            System.out.println("Nome: " + valor.getKey() + "\t\tIdade: " + valor.getValue());
        }

        System.out.println("\n----- 3 -----");
        HashSet<String> cores = new HashSet<>();
        cores = colecoes.adicionarCores(cores);
        System.out.println("Total de Cores: " + cores.size());

        System.out.println("\n----- 4 -----");
        Map<String, Double> funcionarios = colecoes.guardarFuncionarios();

        for (Map.Entry<String, Double> valor : funcionarios.entrySet()) {
            System.out.println("Nome: " + valor.getKey() + "\t\t Salario: " + valor.getValue());
        }

        System.out.println("\nA média salaria é: " + colecoes.calcularMediaSalarial(funcionarios));

        System.out.println("\n----- 5 -----");
        Map<String, Integer> palavras = colecoes.palavras();
        for (Map.Entry<String, Integer> valor : palavras.entrySet()) {
            System.out.println(valor.getKey());
        }

        System.out.println("\n----- 6 -----");
        List<String> frutas = colecoes.adicionarFrutas();

        System.out.println("Lista de Frutas contém 'Banana'? " + frutas.contains("Banana"));
    }
}
