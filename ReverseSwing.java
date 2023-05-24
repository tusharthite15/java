import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReverseSwing extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public ReverseSwing() {
        setTitle("Reverse Number");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        inputField = new JTextField();
        reverseButton = new JButton("Reverse");
        resultLabel = new JLabel();

        reverseButton.addActionListener(this);

        panel.add(inputField);
        panel.add(reverseButton);
        panel.add(resultLabel);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reverseButton) {
            String input = inputField.getText();
            int number;

            try {
                number = Integer.parseInt(input);
                int reversedNumber = reverseNumber(number);
                resultLabel.setText("Reversed number: " + reversedNumber);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }
    }

    private int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverseSwing gui = new ReverseSwing();
            gui.setVisible(true);
        });
    }
}
