# dd
import java.io.*;
import java.util.*;
public class Palindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in);
String str;
String reverse="";
System.out.println("enter the string");
str=br.readLine();
int len=str.length();

for(int i=len-1;i>-1;i--)
    {
      reverse=reverse+str.charAt(i);
    }
    System.out.println("Reversed String is: "+reverse);
    
    if(str.equals(reverse))
    {
      System.out.println("The Given String is Palindrome");
    }
    else
    {
      System.out.println("The Given String is not a Palindrome");
    }
    }
    

