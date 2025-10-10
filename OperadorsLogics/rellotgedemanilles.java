import java.util.Locale;
import java.util.Scanner;

public class rellotgedemanilles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); // para leer números con punto decimal correctamente

        // leer la hora, minutos y segundos desde la entrada
        float HH = sc.nextFloat(); // Horas
        float MM = sc.nextFloat(); // Minutos
        float SS = sc.nextFloat(); // Segundos

        // calcular el ángulo de la manilla de las horas
        // cada hora = 30° (360° / 12 horas)
        // cada minuto hace avanzar la manilla de horas 0.5° (30° / 60 minutos)
        // cada segundo hace avanzar la manilla de horas 0.5° / 60 ≈ 0.00833° (por segundo)
        float gradosH = HH * 30f + (MM * 0.5f) + (SS * (0.5f / 60f));

        // calcular el ángulo de la manilla de los minutos
        // cada minuto = 6° (360° / 60 minutos)
        // cada segundo hace avanzar la manilla de minutos 0.1° (6° / 60 segundos)
        float gradosM = MM * 6f + SS * 0.1f;

        // calcular el angulo de la manilla de los segundos
        // cada segundo = 6° (360° / 60 segundos)
        float gradosS = SS * 6f;

        // imprimir los angulos calculados de cada manilla
        System.out.println(gradosH); // angulo de la manilla de horas
        System.out.println(gradosM); // angulo de la manilla de minutos
        System.out.println(gradosS); // angulo de la manilla de segundos
    }
}
