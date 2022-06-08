package entities.subclasses;

import entities.Censura;

public class Familia extends Censura {
    private String censura = "Livre";
    public Familia() {
    }
    public void classificacao(){
        System.out.println("Esse filme é livre para todas as idades.");
    }

    @Override
    public String toString() {
        return "Familia{" +
                "censura='" + censura + '\'' +
                '}';
    }
}