public class Poema extends Obra{
    public Poema(String titulo, String autor, int anoLancamento) {
        super(titulo, autor, anoLancamento);
    }

    private String tema;

    public Poema(String titulo, String autor, int anoLancamento, String tema) {
        super(titulo, autor, anoLancamento);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}


