import java.util.Locale;
import java.util.Scanner;

public class maquinadev {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.ENGLISH);

        float balance = 0.00f;
        int stock = sc.nextInt();
        float price = sc.nextFloat();
        String operation = "";

        bucle_principal:
        while (!operation.equals("OFF")) {
            if (balance == 0) {
                System.out.println("Insert coin");
            } else {
                System.out.println("Balance:" + balance);
            }

            operation = sc.next();
            switch (operation) {
                case "INSERT":
                   float money = sc.nextFloat();
                   balance = balance + money;
                   break;
                case "EXPEND":
                    if (stock > 0) {
                        if (balance >= price) {
                            stock--;
                            balance = balance - price;
                            System.out.println("Your water, thanks");
                        } else {
                            System.out.println("Price:" + price);
                        }
                    } else {
                        System.out.println("Product unavailable");
                    }
                    break;
                case "REFUND":
                    System.out.println("Refund:" + balance);
                    balance = 0;
                    break;
                case "OFF":
                    break bucle_principal;
            }

        }
    }
}
