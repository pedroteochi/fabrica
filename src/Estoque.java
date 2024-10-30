import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int codEstoque;
    private List<Produto> produtos = new ArrayList<>();
    private List<MateriaPrima> materiasPrimas = new ArrayList<>();

    public Estoque(int codEstoque) {
        this.codEstoque = codEstoque;
    }

    public int getCodEstoque() {
        return codEstoque;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto, double quantidade) {
        produto.setQuantidade(quantidade);
        this.produtos.add(produto);
    }

    public List<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void adicionarMateriaPrima(MateriaPrima materiaPrima, double quantidade) {
        materiaPrima.setQuantidade(quantidade);
        this.materiasPrimas.add(materiaPrima);
    }
}
