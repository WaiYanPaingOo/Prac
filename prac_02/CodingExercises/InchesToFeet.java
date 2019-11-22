public class InchesToFeet {
    public static void main(String[]args)
    {
        int inputValue = 86;
        int feet, inches;
        feet = inputValue / 12;
        inches = inputValue % 12;
        System.out.print(feet+" feet & "+ inches + " inches");
    }
}
