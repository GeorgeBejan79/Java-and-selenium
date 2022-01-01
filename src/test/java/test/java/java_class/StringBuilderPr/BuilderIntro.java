package test.java.java_class.StringBuilderPr;

public class BuilderIntro
{
    public static void main(String[] args)
    {
        String str = "";

        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            str += ch;
        }
        System.out.println(str);
        StringBuilder builder = new StringBuilder();

        for (char ch = 'a'; ch < 'z'; ch++)
        {
            builder.append(ch);

        }System.out.println(builder);
    }
}
