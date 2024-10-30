import java.util.ArrayList;
import java.util.List;

public class OrdemProducao {
    private int numOrdemProducao;
    private Produto produto;
    private List<Maquina> maquinas = new ArrayList<>();
    private List<MateriaPrima> materiasPrimas = new ArrayList<>();
    private double qtdProducao;

    public OrdemProducao(int numOrdemProducao, Produto produto, double qtdProducao) {
        this.numOrdemProducao = numOrdemProducao;
        this.produto = produto;
        this.qtdProducao = qtdProducao;
    }

    public int getNumOrdemProducao() {
        return numOrdemProducao;
    }

    public void setNumOrdemProducao(int numOrdemProducao) {
        this.numOrdemProducao = numOrdemProducao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void adicionarMaquina(Maquina maquina) {
        this.maquinas.add(maquina);
    }

    public List<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void adicionarMateriaPrima(MateriaPrima materiaPrima) {
        this.materiasPrimas.add(materiaPrima);
    }

    public double getQtdProducao() {
        return qtdProducao;
    }

    public void setQtdProducao(double qtdProducao) {
        if (qtdProducao >= 0) {
            this.qtdProducao = qtdProducao;
        }
    }
}
