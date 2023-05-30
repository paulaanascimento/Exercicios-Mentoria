import java.util.*;

public class Collections {

    Scanner entrada = new Scanner(System.in);
    public List<Integer> retornaListaNumerosInteiros(){
        List<Integer> inteiros = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            inteiros.add(i);
        }

        return inteiros;
    }

    public HashMap<String, Integer> guardarNomeIdade(){
        String nome;
        int idade;

        HashMap<String, Integer> nomeIdade = new HashMap<>();

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome da " + (i+1) + " pessoa:");
            nome = entrada.nextLine();
            System.out.println("Agora digite a idade dela:");
            idade = entrada.nextInt();
            entrada.nextLine();
            nomeIdade.put(nome, idade);
        }

        return nomeIdade;
    }

    public HashSet<String> adicionarCores(HashSet<String> hashSet){
        hashSet.add("Azul");
        hashSet.add("Vermelho");
        hashSet.add("Roxo");
        hashSet.add("Amarelo");
        hashSet.add("Preto");

        return hashSet;
    }

    public Map<String, Double> guardarFuncionarios() {
        String nome;
        double salario;

        Map<String, Double> funcionarios = new Hashtable<>();

        for(int i = 0; i < 8; i++){
            System.out.println("Digite o nome do " + (i+1) + " funcionario:");
            nome = entrada.nextLine();
            System.out.println("Agora digite o salário dele:");
            salario = entrada.nextDouble();
            entrada.nextLine();
            funcionarios.put(nome, salario);
        }

        return funcionarios;
    }

    public double calcularMediaSalarial(Map<String, Double> funcionarios){
        double soma = 0;

        for (Map.Entry<String, Double> valor : funcionarios.entrySet()) {
            soma = soma + valor.getValue();
        }

        return soma/funcionarios.size();
    }

    public Map<String, Integer> palavras(){
        String palavra;

        Map<String, Integer> palavras = new TreeMap<>();

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite a " + i + " palavra:");
            palavra = entrada.nextLine();
            palavras.put(palavra, i);
        }

        return palavras;
    }

    public List<String> adicionarFrutas() {
        List<String> frutas = new LinkedList<>();

        frutas.add("Kiwi");
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Maça");
        frutas.add("Banana");

        return frutas;
    }
}
