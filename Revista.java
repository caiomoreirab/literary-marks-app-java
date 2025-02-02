public class Revista extends Obra{
    public Revista(String titulo, String autor, int anoLancamento) {
        super(titulo, autor, anoLancamento);
    }
    private double edicao;
    private int volume;

    public Revista(String titulo, String autor, int anoLancamento, double edicao, int volume) {
        super(titulo, autor, anoLancamento);
        this.edicao = edicao;
        this.volume = volume;
    }

    public double getEdicao() {
        return edicao;
    }

    public void setEdicao(double edicao) {
        this.edicao = edicao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
