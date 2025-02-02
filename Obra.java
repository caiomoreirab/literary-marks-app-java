import java.util.ArrayList;
import java.util.List;
public class Obra {
    private String titulo;
    private String autor;
    private int anoLancamento;
    private List<String> citacoes;  // vai armazenar as citações
    public List<String> getCitacoes() {
        return citacoes;
    }

    public void adicionarCitacao(String citacao) {
        citacoes.add(citacao);
    }

    public Obra(String titulo, String autor, int anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.citacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
