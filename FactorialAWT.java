import java.awt.*;
import java.awt.event.*;

public class FactorialAWT extends Frame implements ActionListener {
    private TextField inputField;
    private Label resultLabel;

    public FactorialAWT() {
        setTitle("Factorial Calculator");
        setSize(500, 350);
        setLayout(new FlowLayout());

        Label inputLabel = new Label("Enter a number:");
        add(inputLabel);

        inputField = new TextField(10);
        add(inputField);

        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new Label();
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            long factorial = calculateFactorial(number);
            resultLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    private long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        new FactorialAWT();
    }
}
