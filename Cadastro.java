import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    Scanner ler = new Scanner(System.in);

    private List<Obra> obras = new ArrayList<>(); //Obras em geral
    private List<Livro> livros = new ArrayList<>(); // livros
    private List<Jornal> jornais = new ArrayList<>(); // Lista para armazenar jornal
    private List<Poema> poemas = new ArrayList<>(); // poemas
    private List<Revista> revistas = new ArrayList<>(); // revistas

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }




    public void cadastraJornal() {
        System.out.println("Cadastro do Jornal: ");
        System.out.print("Digite o título do jornal: \n ");
        String titulo = ler.nextLine();

        System.out.println("Digite o autor do Jornal:  ");
        String autor = ler.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite a data de lançamento: ");
        String data = ler.nextLine();

        System.out.println("Digite o tema: ");
        String tema = ler.nextLine();

        Jornal jornal = new Jornal(titulo, autor, anoLancamento, data, tema);
        jornais.add(jornal);
        obras.add(jornal);

        System.out.println("Jornal cadastrado com sucesso!! ");

    }



    public void cadastraLivro() {
        System.out.println("Cadastro de livro: ");

        System.out.println("Digite o titulo do Livro: ");
        String titulo = ler.nextLine();

        System.out.println("Digite o nome do autor do Livro: ");
        String autor = ler.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite o tipo do Livro: ");
        String tipo = ler.nextLine();

        Livro livro = new Livro(titulo, autor, anoLancamento, tipo);

        livros.add(livro);
        obras.add(livro);
        System.out.println("Livro cadastrado com sucesso!!");
    }




    public void cadastraPoema() {
        System.out.println("Cadastrar poema: ");

        System.out.println("Digite o título: ");
        String titulo = ler.nextLine();

        System.out.println("Digite o autor: ");
        String autor = ler.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite o tema do poema: ");
        String tema = ler.nextLine();

        Poema poema = new Poema(titulo, autor, anoLancamento, tema);

        poemas.add(poema);
        obras.add(poema);

        System.out.println("Poema cadastrado com sucesso!! ");
    }




    public void cadastraRevista() {
        System.out.println("Cadastrar Revista: ");

        System.out.println("Digite o título: ");
        String titulo = ler.nextLine();

        System.out.println("Digite o autor do Poema: ");
        String autor = ler.nextLine();

        System.out.println("Digite o ano de Laçamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite a edição da revista: ");
        double edicao = ler.nextDouble();

        System.out.println("Digite o volume da Revista: ");
        int volume = ler.nextInt();
        ler.nextLine();

        Revista revista = new Revista(titulo, autor, anoLancamento, edicao, volume);

        revistas.add(revista);
        obras.add(revista);

        System.out.println("Revista cadastrada com sucesso!! ");


    }



    public void cadastraMarcacao(){
        System.out.println("Digite o titulo da obra: ");
        String titulo = ler.nextLine();
        boolean obraEncontrada = false;

        for (int i=0; i<obras.size();i++) {
            Obra obra = obras.get(i);
            if (obra.getTitulo().equals(titulo)) {
                obraEncontrada = true;
                System.out.println("Obra encontrada!");
                System.out.println("Digite a marcação: ");
                String citacao = ler.nextLine();
                obra.adicionarCitacao(citacao); // Adiciona a citação diretamente na obra
                System.out.println("Citação adicionada com sucesso!!");
                break;
            }
        }
        if(!obraEncontrada){
            System.out.println("Obra não encontrada!! ");
        }
    }
}
