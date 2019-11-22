import javax.swing.*;

public class InchesToFeetInteractive
{
    public static void main(String[]args)
    {
        int inputValue = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter number of inches", "Inches Input", JOptionPane.INFORMATION_MESSAGE));
        int feet, inches;
        feet = inputValue / 12;
        inches = inputValue % 12;
        JOptionPane.showMessageDialog(null, feet+" feet & "+ inches + " inches");
    }
}
