import java.util.Scanner;

public class kmApi {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a placa do veiculo: ");
        String plate = read.next();
        System.out.print("Informe o valor do combustivel: ");
        double gasPrice = read.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 60 KM/H: ");
        double km60 = read.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 80 KM/H: ");
        double km80 = read.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 100 KM/H: ");
        double km100 = read.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 120 KM/H: ");
        double km120 = read.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 140 KM/H: ");
        double km140 = read.nextDouble();
        read.close();

        double gasKm60 = km60/30.7;
        double gasKm80 = km80/26.8;
        double gasKm100 = km100/22.4;
        double gasKm120 = km120/18.1;
        double gasKm140 = km140/14.5;

        double gastTotal = gasKm60+gasKm80+gasKm100+gasKm120+gasKm140;
        double averegeVel = ((km60*60) + (km80*80) + (km100*100) + (km120*120) + (km140*140))/(km60+km80+km100+km120+km140);
        double spent = gastTotal * gasPrice;

        System.out.printf("Placa do veiculo: %s\n", plate);
        System.out.printf("Consumo total: %.4f Litros \n", gastTotal);
        System.out.printf("Valor total da viagem: R$%.2f \n", spent);
        System.out.printf("A velocidade media ponderada da viagem: %.4f \n", averegeVel);



    }
}





//signed by VictorJosephF
