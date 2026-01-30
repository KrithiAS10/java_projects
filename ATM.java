
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ATM {

    private static JFrame frame;
    private double balance = 1000.0;
    private static ATM a1;

    public static void main(String[] args) {
        // String name = JOptionPane.showConfirmDialog(null, "Withdraw");
        a1 = new ATM();
        a1.MyFrame();
    }

    public void MyFrame() {
        JButton withdrawBtn;
        JButton depositeBtn;
        JButton checkBalBtn;
        // JButton button4;
        withdrawBtn = new JButton();
        depositeBtn = new JButton();
        checkBalBtn = new JButton();
        // button4 = new JButton();
        withdrawBtn.setBounds(450, 500, 100, 50);
        withdrawBtn.setText("Withdraw");
        depositeBtn.setBounds(700, 500, 100, 50);
        depositeBtn.setText("Deposit");
        checkBalBtn.setBounds(950, 500, 150, 50);
        checkBalBtn.setText("Check Balance");
        // button4.setBounds(1000, 500, 100, 50);
        // button4.setText("Withdraw");
        withdrawBtn.addActionListener(e -> {
            double amtWithdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to withdraw"));
            // double updatedAmt = B1.Withdraw(amtWithdraw);
            JOptionPane.showMessageDialog(frame, "Updated Balance after Withdraw:" + a1.withdraw(amtWithdraw));
        });
        depositeBtn.addActionListener(e -> {
            double amtdeposite = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to deposite"));
            // double updatedAmt = B1.Deposite(amtdeposite);
            JOptionPane.showMessageDialog(frame, "Updated Balance after Deposite:" + a1.deposit(amtdeposite));
        });
        checkBalBtn.addActionListener(e -> {
            double updatedAmt = a1.checkBalance();
            JOptionPane.showMessageDialog(frame, "Total Balance:" + updatedAmt);
        });
        // withdrawBtn.setIcon(icon);
        // withdrawBtn.setFocusable(false);
        // withdrawBtn.setHorizontalAlignment(JButton.CENTER);
        // withdrawBtn.setVerticalAlignment(JButton.CENTER);
        JLabel label = new JLabel();
        label.setText("WELCOME");
        label.setText("What you want to do");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Roman", Font.PLAIN, 50));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setForeground(new Color(0xFFFFFF));
        // label.setHorizontalTextPosition(JLabel.RIGHT);
        // label.setVerticalTextPosition(JLabel.RIGHT);

        frame = new JFrame();
        frame.setSize(1024, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ATM Machine");
        ImageIcon image = new ImageIcon("ATM.png");
        frame.setIconImage(image.getImage());
        frame.add(withdrawBtn);
        frame.add(depositeBtn);
        frame.add(checkBalBtn);
        // frame.add(button4);
        frame.add(label);
        frame.setVisible(true);
        // frame.pack();
        // frame.getContentPane().setBackground(new Color(123, 150, 450));
    }

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
