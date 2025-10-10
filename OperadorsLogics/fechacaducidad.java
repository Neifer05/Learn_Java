import java.util.Locale;
import java.util.Scanner;

public class fechacaducidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int diaLimite = sc.nextInt();
        int mesLimite = sc.nextInt();
        int añoLimite = sc.nextInt();

        int diaActual = sc.nextInt();
        int mesActual = sc.nextInt();
        int añoActual = sc.nextInt();

        boolean res = (añoActual > añoLimite) ||
                (añoActual == añoLimite && mesActual > mesLimite) ||
                (añoActual == añoLimite && mesActual == mesLimite && diaActual > diaLimite);

        System.out.print(res);

    }
}
