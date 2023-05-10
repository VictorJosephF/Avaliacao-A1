import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int year = read.nextInt();
        read.close();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("O ano %d é bissexto.",year);
        } else {
            System.out.printf("O ano %d não é bissexto.",year);
        }
    }
}

//signed by VictorjosephF
// link rep github: https://github.com/VictorJosephF/Avaliacao-A1