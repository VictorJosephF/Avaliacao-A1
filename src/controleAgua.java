import java.util.Scanner;

 class controleAgua {
     public static void main(String[] args){Scanner read = new Scanner(System.in);
         System.out.print("Digite seu nome: ");
         String name = read.next();
         System.out.print("digite seu peso: ");
         double weight = read.nextDouble();
         System.out.print("Informa a quantidade de agua ingerida (em litros): ");
         double waterIngested = read.nextDouble();
         read.close();

         double waterIdeal = Math.ceil((weight*35)/1000);
         double waterMissing = waterIdeal - waterIngested;

         System.out.println("Nome: "+name);
         System.out.printf("Peso: %.2fkg \n",weight);
         System.out.printf("Quantidade de agua ingerida: %.1f Litros. \n", waterIngested);
         System.out.printf("Quantidade de agua ideal: %.1f Litros. \n", waterIdeal);

         if(waterMissing<=0){
             System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
         }
         else{
             System.out.printf("Continue focado em se hidratar por hoje, ainda faltam %.1f litros! Você consegue!", waterMissing);
         }


     }



}

//Obs: deixa o if( < 0) pois se a mata for atingida exatamente com a quantidade ingerida ainda a mensagem que falta \n
// ainda será mostrada mas e o que o exercicio pede.

//by VictorFariaF