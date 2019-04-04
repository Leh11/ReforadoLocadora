package Padrao;

import java.util.Date;

public class CompactCar extends Carro {
    private String category;

    public CompactCar(){}
    public CompactCar(String nome, String marca, Valls vall){
        super(nome, marca, vall);
        this.category = "compacto";
    }
}