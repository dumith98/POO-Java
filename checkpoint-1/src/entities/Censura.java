package entities;

public class Censura {

    private String classificacao;

    public Censura(String classificacao) {
        this.classificacao = classificacao;
    }

    public void Tipo(){
        if (this.classificacao == "L"){
            System.out.println("Esse filme é livre para todas as idades");
        } else if (this.classificacao == "T"){
            System.out.println("Esse filme é para adolescentes, ou seja, para maiores de 12 anos.");
        }  else if (this.classificacao == "A"){
            System.out.println("Esse filme é para maiores de idade somente.");
        } else {
            System.out.println("A classificação dessa fita não está em nossos registros ou não é válida.");
        }
    }
    public Censura() {
    }
}
