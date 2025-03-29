package GHappy;

public class GHappyTest {
    public static void main(String[] args) {
        GHappy gh = new GHappy();

        System.out.println(gh.gHappy("xxggxx"));
        System.out.println(gh.gHappy("xxgxx"));
        System.out.println(gh.gHappy("gg"));
        System.out.println(gh.gHappy("g"));
        System.out.println(gh.gHappy("abc"));
    }
}
