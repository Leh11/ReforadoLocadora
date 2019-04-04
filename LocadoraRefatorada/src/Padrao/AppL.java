package Padrao;

import java.util.Scanner;

public class AppL {

    public static void opcoes(){


        System.out.println("==================================\n"+
                "= 0 - SAIR\n"+
                "= 1 - ADICIONAR CARRO\n"+
                "= 2 - ADICIONAR CLIENTE\n"+
                "= 3 - LISTAR CARROS\n"+
                "= 4 - DISPONIVILIDADE DE CARRO POR DATA\n"+
                "= 5 - ALUGAR CARRO\n"+
                "= 6 - LISTAR CARROS ALUGADOS\n"+
                "= 7 - LISTA DE CLIENTES\n"+
                "==================================");
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        LoccSystem loccSystem = LoccSystem.instance();
        int opcao = -1;

        do {
            opcoes();
            opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    loccSystem.resgisterCARS();
                    break;
                case 2:
                    loccSystem.registerCLIENT();
                    break;
                case 3:
                    loccSystem.showCARS();
                    break;
                case 4:
                    loccSystem.showCarsByDate();
                    break;
                case 5:
                    loccSystem.rentCARS();
                    break;
                case 6:
                    loccSystem.carsRENTED();
                    break;

                case 7:
                    loccSystem.showClient();
                default:
            }
        }while (opcao != 0);
    }
}
