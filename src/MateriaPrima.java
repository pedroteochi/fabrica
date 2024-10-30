public class MateriaPrima {
    private int codMateriaPrima;
    private String descricaoMateriaPrima;
    private double quantidade;

    public MateriaPrima(int codMateriaPrima, String descricaoMateriaPrima) {
        this.codMateriaPrima = codMateriaPrima;
        this.descricaoMateriaPrima = descricaoMateriaPrima;
    }

    public int getCodMateriaPrima() {
        return codMateriaPrima;
    }

    public void setCodMateriaPrima(int codMateriaPrima) {
        this.codMateriaPrima = codMateriaPrima;
    }

    public String getDescricaoMateriaPrima() {
        return descricaoMateriaPrima;
    }

    public void setDescricaoMateriaPrima(String descricaoMateriaPrima) {
        this.descricaoMateriaPrima = descricaoMateriaPrima;
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
