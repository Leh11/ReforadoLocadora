package Padrao;

public class Client {

    private String name;
    private int phone;
    private Adress adress;

    public Client(){}

    public Client(String name, int phone, Adress adress){
        this.setName(name);
        this.setPhone(phone);
        this.setAdress(adress);
    }
    protected Client newClient(){
        return new Client();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
