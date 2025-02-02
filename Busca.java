import java.util.List;
import java.util.Scanner;

public class Busca {// operações com busca

    Scanner ler = new Scanner(System.in);


    public void removerObra(List<Obra> obras) {
        System.out.println("Titulo da obra que deseja remover: ");
        String tituloId = ler.nextLine();
        boolean obraEncontrada = false;


        for (int i = 0; i < obras.size(); i++) {
            Obra obra = obras.get(i);
            if (obra.getTitulo().equals(tituloId)) {
                obras.remove(i);
                obraEncontrada = true;
                System.out.println("Obra removida com sucesso!! ");
                break;
            }
        }
        if (!obraEncontrada) {
            System.out.println("Obra não encontrada!! ");
        }
    }

    public void limparObras(List<Obra> obras){
        obras.clear();
        System.out.println("Todas as obras foram removidas do seu banco de dados!! ");
    }

    public void buscaCitacoesTitulo(List<Obra> obras){
        System.out.println("Digite o titúlo da obra: ");
        String titulo = ler.nextLine();
        boolean obraEncontrada = false;

        for(int i =0; i < obras.size(); i++){
            Obra obra = obras.get(i);
            if(obra.getTitulo().equals(titulo)){
                obraEncontrada = true;
                System.out.println("CITAÇÕES:");
                System.out.println(obra.getCitacoes());
            }
        }

        if(!obraEncontrada) {
            System.out.println("Obra não encontrada!!");
        }
    }
}
