package Padrao;

public class LuxCar extends Carro {
    private String category;

    public LuxCar(){}
    public LuxCar(String nome, String marca, Valls vall){
        super(nome, marca, vall);
        this.category = "luxo";
    }

}
