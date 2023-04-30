import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();

        int opcao = 0;

        while(opcao != 4){
            System.out.println("\n|------------ Menu ------------|");
            System.out.println("    1. Adicionar alunos");
            System.out.println("    2. Exibir alunos");
            System.out.println("    3. Calcular média");
            System.out.println("    4. Sair");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    alunos.add(entrada.next());
                    //alunos.add(entrada.nextLine());
                    break;
                case 2:
                    for(int i = 0; i < alunos.size(); i++){
                        System.out.println(alunos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Digite a primeira nota: ");
                    double nota1 = entrada.nextInt();

                    System.out.println("Digite a segunda nota: ");
                    double nota2 = entrada.nextInt();

                    System.out.println("Média: " + (nota1+nota2)/2);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}