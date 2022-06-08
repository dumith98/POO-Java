package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome, endereco;
    Vhs vhs;
    List<Vhs> lista = new ArrayList<Vhs>();

    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void Alugar(Vhs vhs){
        lista.add(vhs);
        System.out.println("Parabens " + getNome());
        vhs.Alugar();
    }
    public void Devolver(Vhs vhs){
        if (lista.contains(vhs)){
            System.out.println("Obrigado por ser nosso cliente " + getNome());
            vhs.Devolver();
        }else {
            System.out.println("O Cliente " + getNome() + " não alugou a fita " + vhs.getNomeDaFita());
        }
    }
    public Cliente() {
    }
}
