package ChocolateBags;

public class ChocolateBagsTest {
    public static void main(String[] args) {
        ChocolateBags cb = new ChocolateBags();

        int resultado1 = cb.calculate(10, 2, 12);
        System.out.println(resultado1);

        int resultado2 = cb.calculate(1, 2, 12);
        System.out.println(resultado2);

        int resultado3 = cb.calculate(5, 2, 10);
        System.out.println(resultado3);
    }
}
