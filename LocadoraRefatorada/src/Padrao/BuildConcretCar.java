package Padrao;

public class BuildConcretCar extends BuildCar{

    @Override
    public Carro carsBuild(String type) {
        switch (type){
            case "LUXO":
                return new LuxCar();

            case "COMPACTO":
                return new CompactCar();

            case "MEDIO":
                return new MediumCar();
        }
        return null;
    }

}
