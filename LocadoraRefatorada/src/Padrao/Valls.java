package Padrao;

public class Valls {

    private double priceBought;
    private double rentPrice;

    public Valls(){}

    public Valls(double priceBought, double rentPrice){
        this.setPriceBought(priceBought);
        this.setRentPrice(rentPrice);
    }

    public double getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(double priceBought) {
        this.priceBought = priceBought;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }
}
