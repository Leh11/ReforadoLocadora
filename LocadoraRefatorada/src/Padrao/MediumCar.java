package Padrao;

public class MediumCar extends Carro {
    private String category;

    public MediumCar() {
    }

    public MediumCar(String nome, String marca, Valls vall) {
        super(nome, marca, vall);
        this.category = "medio";
    }
}