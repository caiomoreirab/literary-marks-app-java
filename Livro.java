public class Livro extends Obra{
    public Livro(String titulo, String autor, int anoLancamento) {
        super(titulo, autor, anoLancamento);
    }
    private String tipo;

    public Livro(String titulo, String autor, int anoLancamento, String tipo) {
        super(titulo, autor, anoLancamento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
