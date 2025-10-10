import java.util.Locale;
import java.util.Scanner;
public class dosreinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        boolean fila = (y1 == y2);
        boolean columna = (x1 == x2);
        boolean diagonalsuma = (y1 + x1 == y2 + x2);
        boolean diagonalresta = (y1 - x1 == y2 - x2);

        System.out.print(fila || columna || diagonalsuma || diagonalresta);

    }
}
