package test.java.java_class.Lambadas;

import java.util.ArrayList;
import java.util.List;

public class LambadasIntro
{
    public static void main(String[] args)
    {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h');//removes all the strings witch starts with different chars than h
        System.out.println(bunnies);
    }
}
