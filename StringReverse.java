import java.util.*;
class StringReverse
{

    static void reverse(String str)
    {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse of the string is: " + rev);
    }
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        reverse(str);
        sc.close();
    }
}