import java.text.DecimalFormat;

public class MinuteConversion {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[]args)
    {
        double inputValue = 6000;
        double days, hours;
        hours = inputValue / 60;
        days = hours / 24;
        System.out.print(inputValue + " minutes equals " + hours + " hours and equals " + df2.format(days) + " days");
    }
}
