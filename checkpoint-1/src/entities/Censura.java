package entities;

public class Censura {

    private String classificacao;

    public Censura(String classificacao) {
        this.classificacao = classificacao;
    }

    public void Tipo(){
        if (classificacao == "L"){
            System.out.println("Esse filme é livre para todas as idades");
        } else if (classificacao == "T"){
            System.out.println("Esse filme é para adolescentes, ou seja, para maiores de 12 anos.");
        }  else if (classificacao == "A"){
            System.out.println("Esse filme é para maiores de idade somente.");
        }
    }
    public Censura() {
    }
}
