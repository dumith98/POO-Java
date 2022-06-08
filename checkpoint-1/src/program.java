import entities.Classificacao;
import entities.Cliente;
import entities.Filial;
import entities.Vhs;

public class program {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente(1, "Dumith", "Rua do Dumith");

        Classificacao familia = new Classificacao("L");
        Filial paraiba = new Filial(1 , "Paraiba", "Rua da paraiba");
        Vhs cinderela = new Vhs(1, "Cinderela", 30, paraiba, familia);
        cinderela.Alugar();
        cinderela.Devolver();
        System.out.println(cinderela.getNomeDaFita());
        System.out.println(cinderela.getFilial());
        familia.Tipo();


        Vhs pinoquio = new Vhs(2, "Pinóquio", 40, new Filial(2, "Belo Horizonte", "rua de belo horizonte"), new Classificacao("A"));
        pinoquio.Alugar();
        pinoquio.Devolver();
        System.out.println(pinoquio.getFilial());

        cl1.Alugar(cinderela);
        cl1.Devolver(pinoquio);
        cl1.Devolver(cinderela);
    }
}
