public class Jornal extends Obra{

    public Jornal (String titulo, String autor, int ano, int data, int tema){
        super(titulo,autor,ano);
    }

    private String tema;
    private String data;

    public Jornal(String titulo, String autor, int anoLancamento, String tema, String data) {
        super(titulo, autor, anoLancamento);
        this.tema = tema;
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
