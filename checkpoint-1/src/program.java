import entities.Censura;
import entities.Filial;
import entities.Vhs;
import entities.subclasses.Familia;

public class program {

    public static void main(String[] args) {
        Censura familia = new Censura("L");
        Filial paraiba = new Filial(1 , "Paraiba", "Rua da paraiba");
        Vhs cinderela = new Vhs(1, "Cinderela", 30, paraiba, familia);
        cinderela.Alugar();
        cinderela.Alugar();
        cinderela.Alugar();
        cinderela.Devolver();
        cinderela.Tipo();
    }
}
