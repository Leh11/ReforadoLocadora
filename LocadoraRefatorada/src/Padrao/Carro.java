package Padrao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Carro {

    private String name;
    private int iD;
    private String brand;
    private Valls vall;
    private Date rentDate;
    private String category;
    private boolean status;

    public Carro(){}
    public Carro(String name, String marca, Valls vall){
        this.setName(name);
        this.setBrand(marca);
        this.setVall(vall);
        this.status = false;
        this.iD = new Random().nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Valls getVall() {
        return vall;
    }

    public void setVall(Valls vall) {
        this.vall = vall;
    }

    public String getCategory() {
        return category;
    }

    public boolean getStatus() {
        return status;
    }

    public String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        Date rentDate = new Date();
        return dateFormat.format(rentDate);
    }

    public int getiD(){
        return iD;
    }

    public void changeStatus(){
        if (status){
            status = false;
        }else {
            status = true;
        }
    }

}
