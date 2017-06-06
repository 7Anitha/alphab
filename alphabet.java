import java.io.*;
import java.util.Scanner;
class alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if((c>='a' && c<='z')||(c>='A' && c<='Z'))
{
System.out.println(c+"is alphabet");
}
else
{
System.out.println(c+"is not a alphabet");
}
}
}
