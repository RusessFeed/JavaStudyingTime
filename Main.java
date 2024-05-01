//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;

        while (hours != 24 && minutes != 60) {
            System.out.println("Я учу Java в " + hours + ":" + minutes);
            minutes++;
            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
        }
    }
}