import java.util.ArrayList;
import java.util.List;

public class Maquina {
    private int numMaquina;
    private List<OrdemProducao> ordensProducao = new ArrayList<>();

    public Maquina(int numMaquina) {
        this.numMaquina = numMaquina;
    }

    public int getNumMaquina() {
        return numMaquina;
    }

    public void setNumMaquina(int numMaquina) {
        this.numMaquina = numMaquina;
    }

    public List<OrdemProducao> getOrdensProducao() {
        return ordensProducao;
    }

    public void adicionarOrdemProducao(OrdemProducao ordemProducao) {
        this.ordensProducao.add(ordemProducao);
    }
}
