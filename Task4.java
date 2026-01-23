
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Task4 {

    static Scanner sc = new Scanner(System.in);
    static String a[] = {"INR", "USD", "AUD", "BGN", "CAD", "CHF", "CNY", "EGP", "EUR", "GBP"};
    static String targetCurrency;
    static String baseCurrency;
    static double amount;
    static String apiurl;

    public static void main(String[] args) throws Exception {
        System.out.println("Enter an amount you want to conver:");
        for (String a1 : a) {
            System.out.println(a1);
        }
        System.out.println("Enter your base currency type");
        baseCurrency = sc.next().toUpperCase();
        System.out.println("Enter your target currency type");
        targetCurrency = sc.next().toUpperCase();
        apiurl = "https://v6.exchangerate-api.com/v6/8c529054bb48fd0a0b328308/latest/" + baseCurrency;
        URL url = new URL(apiurl);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        String response = sb.toString();
        br.close();
        int index = response.indexOf("\"" + targetCurrency + "\":");
        int start = index + targetCurrency.length() + 3;
        int end = response.indexOf(",", start);
        System.out.println(start);
        System.out.println(end);
        if (end == -1) {
            end = response.indexOf("}", start);
        }

        double rate = Double.parseDouble(response.substring(start, end));
        System.out.println("Enter an amount you want to conver:");
        amount = sc.nextDouble();
        double convertedAmount = amount * rate;
        System.out.println("Converted Amount: " + convertedAmount);
    }
}
