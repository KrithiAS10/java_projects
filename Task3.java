
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task3 {

    private static JFrame frame;
    // public double balance = 1000.0;
    BankAcc B1 = new BankAcc();

    public static void main(String[] args) {
        // String name = JOptionPane.showConfirmDialog(null, "withdraw");
        Task3 a1 = new Task3();
        a1.MyFrame();
    }

    public void MyFrame() {
        JButton withdrawBtn;
        JButton depositBtn;
        JButton checkBalBtn;
        // JButton button4;
        withdrawBtn = new JButton();
        depositBtn = new JButton();
        checkBalBtn = new JButton();
        // button4 = new JButton();
        withdrawBtn.setBounds(450, 500, 100, 50);
        withdrawBtn.setText("Withdraw");
        depositBtn.setBounds(700, 500, 100, 50);
        depositBtn.setText("Deposit");
        checkBalBtn.setBounds(950, 500, 150, 50);
        checkBalBtn.setText("Check Balance");
        // button4.setBounds(1000, 500, 100, 50);
        // button4.setText("withdraw");
        withdrawBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter amout");
            if (input == null) {
                return;
            }
            double amtwithdraw;
            try {
                amtwithdraw = Double.parseDouble(input);
                JOptionPane.showMessageDialog(frame, "Updated Balance after withdraw:" + B1.withdraw(amtwithdraw));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid number");
            }
        });
        depositBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter amount");
            if (input == null) {
                return;
            }

            double amtdeposit;
            try {
                amtdeposit = Double.parseDouble(input);
                JOptionPane.showMessageDialog(frame, "Updated Balance after deposit:" + B1.deposit(amtdeposit));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid number");
            }
        });
        checkBalBtn.addActionListener(e -> {
            double updatedAmt = B1.checkBalance();
            JOptionPane.showMessageDialog(frame, "Total Balance:" + updatedAmt);
        });
        JLabel label = new JLabel();
        label.setText("WELCOME");
        label.setText("What you want to do");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Roman", Font.PLAIN, 50));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setForeground(new Color(0xFFFFFF));

        frame = new JFrame();
        frame.setSize(1024, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ATM Machine");
        ImageIcon image = new ImageIcon("ATM.png");
        frame.setIconImage(image.getImage());
        frame.add(withdrawBtn);
        frame.add(depositBtn);
        frame.add(checkBalBtn);
        // frame.add(button4);
        frame.add(label);
        frame.setVisible(true);
    }
}
