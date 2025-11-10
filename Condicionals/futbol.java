import java.util.Locale;
import java.util.Scanner;

public class futbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        int partidosGanadosA = input.nextInt() * 3;
        int partidosEmpatadosA = input.nextInt();
        int partidosPerdidosA = input.nextInt() * 0;
        int golesA = input.nextInt();
        int golesEnContraA = input.nextInt();

        int partidosGanadosB = input.nextInt() * 3;
        int partidosEmpatadosB = input.nextInt();
        int partidosPerdidosB = input.nextInt() * 0;
        int golesB = input.nextInt();
        int golesEnContraB = input.nextInt();

        int puntosA = partidosGanadosA + partidosEmpatadosA + partidosPerdidosA;
        int puntosB = partidosGanadosB + partidosEmpatadosB + partidosPerdidosB;
        int restaGolesA = golesA - golesEnContraA;
        int restaGolesB = golesB - golesEnContraB;

        if (puntosA > puntosB || puntosA == puntosB && restaGolesA > restaGolesB) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
