import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Busca busca = new Busca();


        Scanner scanner = new Scanner(System.in);


        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Poema");
            System.out.println("3. Cadastrar Revista");
            System.out.println("4. Cadastrar Jornal");
            System.out.println("5. Sair");
            System.out.println("6. Adicionar Citação");
            System.out.println("7. Remover Obra");
            System.out.println("8. Buscar Citação por Título");
            System.out.print("Opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastro.cadastraLivro();
                    break;
                case 2:
                    cadastro.cadastraPoema();
                    break;
                case 3:
                    cadastro.cadastraRevista();
                    break;
                case 4:
                    cadastro.cadastraJornal();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                case 6:
                    cadastro.cadastraMarcacao();
                    break;
                case 7:
                    busca.removerObra(cadastro.getObras());
                    break;
                case 8:
                    busca.buscaCitacoesTitulo(cadastro.getObras());
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
