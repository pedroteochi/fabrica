import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigoProduto;
    private String descricaoProduto;
    private List<MateriaPrima> materiasPrimas = new ArrayList<>();
    private double quantidade;

    public Produto(int codigoProduto, String descricaoProduto) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public List<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void adicionarMateriaPrima(MateriaPrima materiaPrima) {
        this.materiasPrimas.add(materiaPrima);
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
}
