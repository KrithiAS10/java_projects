
import javax.swing.JOptionPane;

public class BankAcc {

    private double balance = 1000.0;

    public double withdraw(double w) {
        if (w <= 0) {
            JOptionPane.showMessageDialog(null, "Enter a positive amount");
        } else if (w > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        } else {
            balance -= w;
        }
        return balance;
    }

    public double deposit(double d) {
        if (d < 0) {
            JOptionPane.showMessageDialog(null, "Enter a positive amount");
        } else {
            balance += d;
        }
        return balance;
    }

    public double checkBalance() {
        return balance;
    }
}
