import java.util.Scanner;
public class LexicographicalComparison
{

    public static void main(String[] arg)
    {
        System.out.println("Enter the first text: ");

        Scanner sc = new Scanner(System.in);
        String text1= sc.nextLine();
        System.out.println("Enter the second text: ");
        String text2 = sc.nextLine();
        int nm= text1.compareToIgnoreCase(text2);

        String result="";
        switch (Integer.compare(nm,0))
        {
            case -1 :
                result="less than "; break;
            case 0: result="equal to "; break;
            case 1: result="more than "; break;


        }

     System.out.println(text1 + " is " + result + text2 );
    }
}
