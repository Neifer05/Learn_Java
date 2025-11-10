import java.util.Locale;
import java.util.Scanner;

public class streetfighter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String STATE_CHARACTER = sc.next();
        String EVENT_CHARACTER = sc.next();

        if (STATE_CHARACTER.equals("IDLE") && EVENT_CHARACTER.equals("JOYSTICK_UP")) {
            System.out.print("JUMPING");
        } else if (STATE_CHARACTER.equals("IDLE") && EVENT_CHARACTER.equals("JOYSTICK_LEFT/RIGHT")) {
            System.out.print("WALKING");
        } else if (STATE_CHARACTER.equals("IDLE") && EVENT_CHARACTER.equals("PUNCH_KEY")) {
            System.out.print("PUNCHING");
        } else if (STATE_CHARACTER.equals("IDLE") && EVENT_CHARACTER.equals("KICK_KEY")) {
            System.out.print("KICKING");
        } else if (STATE_CHARACTER.equals("PUNCHING") && EVENT_CHARACTER.equals("PUNCH_END")) {
            System.out.print("IDLE");
        } else if (STATE_CHARACTER.equals("KICKING") && EVENT_CHARACTER.equals("KICK_END")) {
            System.out.print("IDLE");
        } else if (STATE_CHARACTER.equals("JUMPING") && EVENT_CHARACTER.equals("PUNCH_KEY")) {
            System.out.print("PUNCHING");
        } else if (STATE_CHARACTER.equals("JUMPING") && EVENT_CHARACTER.equals("TOUCH_FLOOR")) {
            System.out.print("IDLE");
        } else if (STATE_CHARACTER.equals("JUMPING") && EVENT_CHARACTER.equals("KICK_KEY")) {
            System.out.print("KICKING");
        } else if (STATE_CHARACTER.equals("WALKING") && EVENT_CHARACTER.equals("JOYSTICK_CENTER")) {
            System.out.print("IDLE");
        } else if (STATE_CHARACTER.equals("WALKING") && EVENT_CHARACTER.equals("KICK_KEY")) {
            System.out.print("KICKING");
        } else if (STATE_CHARACTER.equals("WALKING") && EVENT_CHARACTER.equals("PUNCH_KEY")) {
            System.out.print("PUNCHING");
        } else if (STATE_CHARACTER.equals("WALKING") && EVENT_CHARACTER.equals("JOYSTICK_UP")) {
            System.out.print("JUMPING");
        } else {
            System.out.print(STATE_CHARACTER);
        }
    }
}
