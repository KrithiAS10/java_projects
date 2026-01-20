
import javax.swing.JOptionPane;

public class BankAcc extends ATM {

    private double balance;

    public BankAcc() {
        this.balance = 1000.0;
    }

    public double Withdraw(double w) {
        if (w <= 0) {
            JOptionPane.showMessageDialog(null, "Enter a positive amount");
        } else if (w > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient funds.");
        } else {
            balance -= w;
        }
        return balance;
    }

    public double Deposite(double d) {
        if (d < 0) {
            JOptionPane.showMessageDialog(null, "Enter a positive amount");
        } else {
            balance += d;
        }
        return balance;
    }

    public double CheckBalance() {
        return balance;
    }
}
