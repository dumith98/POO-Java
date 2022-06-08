package entities;

public class Vhs {
    private int id;
    private String nomeDaFita;
    private int unidadesDisponiveis;
    private Filial filial;
    private Classificacao classificacao;

    public Vhs() {
    }

    public Vhs(int id, String nomeDaFita, int unidadesDisponiveis, Filial filial, Classificacao classificacao){
        this.id = id;
        this.nomeDaFita = nomeDaFita;
        this.unidadesDisponiveis = unidadesDisponiveis;
        this.filial = filial;
        this.classificacao = classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaFita() {
        return nomeDaFita;
    }

    public void setNomeDaFita(String nomeDaFita) {
        this.nomeDaFita = nomeDaFita;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public int getUnidadesDisponiveis() {
        return unidadesDisponiveis;
    }

    public void setUnidadesDisponiveis(int unidadesDisponiveis) {
        this.unidadesDisponiveis = unidadesDisponiveis;
    }

    public void Alugar(){
        if (unidadesDisponiveis > 0) {
            unidadesDisponiveis -= 1;
            System.out.println("Uma unidade da fita " + getNomeDaFita() + " foi alugada. Restam " + getUnidadesDisponiveis() + " para alugar");
        }
        else{
            System.out.println("Não há unidades disoniveis para alugar");
        }
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public void Devolver(){
        unidadesDisponiveis += 1;
        System.out.println("Você devovleu uma unidade da fita " + getNomeDaFita() + ". Agora restam " + getUnidadesDisponiveis() + ".");
   }

    @Override
    public String toString() {
        return "Vhs{" +
                "id=" + id +
                ", nomeDaFita='" + nomeDaFita + '\'' +
                ", unidadesDisponiveis=" + unidadesDisponiveis +
                ", filial=" + filial +
                ", censura=" + classificacao +
                '}';
    }
}

