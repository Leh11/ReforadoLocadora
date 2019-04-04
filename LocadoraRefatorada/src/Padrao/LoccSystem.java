package Padrao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoccSystem {
    Scanner ler = new Scanner(System.in);
    List<Carro> carsList = new ArrayList();
    List<Client> clientList = new ArrayList();
    private static LoccSystem INSTANCE;

    Carro carro;
    BuildCar buildCar = null;
    BuildConcretCar buildConcretCar;
    Client client;
    private boolean cad = false;
    private boolean n = false;
    private int opcao =-1;

    //
    private String name;
    private String brand;
    private int id;
    private int phone;
    private String rentDate;
    private String category;
    private Valls vall;
    private Adress adress;

    public void resgisterCARS(){
        vall = new Valls();
        buildCar = new BuildConcretCar();
        System.out.print("Modelo do carro: ");
        name = ler.next();
        System.out.print("Marca do carro: ");
        brand = ler.next();
        System.out.print("Categoria do carro: ");
        category = ler.next();
        carro = buildCar.carsBuild(category.toUpperCase());
        if (carro == null) {
            System.out.println("Nao existe este modelo!");
        }else {
            System.out.print("O preco do carro: ");
            vall.setPriceBought(Double.parseDouble(ler.next()));
            System.out.print("Valor do aluguel carro: ");
            vall.setRentPrice(Double.parseDouble(ler.next()));
            carro.setName(name);
            carro.setBrand(brand);
            carro.setVall(vall);
            carsList.add(carro);
            System.out.println("Carro registado!!!");
        }
    }

    public void registerCLIENT(){
        adress = new Adress();
        client = new Client();
        System.out.print("Nome do cliente: ");
        name = ler.next();
        System.out.print("Email do cliente: ");
        adress.setEmail(ler.next());
        System.out.print("CPF do cliente: ");
        adress.setCpf(ler.next());
        System.out.print("Phone: ");
        phone = ler.nextInt();
        client.setName(name);
        client.setPhone(phone);
        client.setAdress(adress);
        clientList.add(client);
        System.out.println("Cliente registado!!!");
    }

    public void showCARS(){
        if (carsList.size() == 0){
            System.out.println("Nao tem carro cadastrado!");
        }else{
            for (int i = 0; i < carsList.size(); i++){
                printObject(i);
            }
        }
    }

    protected void showCarsByDate(){
        System.out.print("Digite a data para ver a disponibilidade do carro: ");
        rentDate = ler.next();
        System.out.print("Categoria desejada: ");
        category = ler.next();
        for (int i = 0; i < carsList.size(); i++){
            if ((rentDate == carsList.get(i).getDate()) && (!carsList.get(i).getStatus()) && (category.equals(carsList.get(i).getCategory()))){
                printObject(i);
                n = true;
            }
        }
        if (!n){
            System.out.println("Nao ha carros disponiveis!");
        }
        n = false;
    }

    public void rentCARS() {
        System.out.print("ID do carro a alugar 'INTEIRO': ");
        id = ler.nextInt();
        for (int i = 0; i < carsList.size(); i++) {
            if (id == carsList.get(i).getiD()) {
                n = true;
                System.out.print("Nome do cliente: ");
                name = ler.next();
                for (int j = 0; j < clientList.size(); j++) {
                    if (name.equals(clientList.get(j).getName())) {
                        carsList.get(i).changeStatus();
                        System.out.println("Alugado!!!");
                        cad = true;
                    }
                }
                break;
            }
        }
        if(!n){
            System.out.println("ID nao encontrado!");
        }else if(!cad){
            System.out.println("Cliente nao encontrado");
        }
        cad = false;
        n = false;
    }

    public void carsRENTED(){
        for (int i = 0; i < carsList.size(); i++){
            if (carsList.get(i).getStatus()){
                printObject(i);
            }
        }
    }

    public void showClient(){
        for (int i = 0; i < clientList.size(); i++){
            System.out.print("====================================\n"+
                    "Nome: "+clientList.get(i).getName()+"\n"+
                    "====================================\n");
        }


    }

    public void printObject(int index){
        System.out.print("====================================\n"+
                "Id: "+carsList.get(index).getiD()+"\n"+
                "Modelo: "+carsList.get(index).getName()+"\n"+
                "Valor do aluguel: "+carsList.get(index).getVall().getRentPrice()+"\n"+
                "Preco do carro: "+carsList.get(index).getVall().getPriceBought()+"\n"+
                "====================================\n");

    }

    public static LoccSystem instance(){
        if (INSTANCE == null){
            INSTANCE = new LoccSystem();
        }
        return INSTANCE;
    }

}
