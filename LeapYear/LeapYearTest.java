package LeapYear;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYear ly = new LeapYear();

        boolean resultado1 = ly.isLeapYear(2016);
        System.out.println(resultado1);

        boolean resultado2 = ly.isLeapYear(2000);
        System.out.println(resultado2);

        boolean resultado3 = ly.isLeapYear(1500);
        System.out.println(resultado3);

        boolean resultado4 = ly.isLeapYear(2017);
        System.out.println(resultado4);
    }
}
