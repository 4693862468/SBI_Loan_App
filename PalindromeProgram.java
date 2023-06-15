class PalindromeProgram

{
public static void main(String[] argds)
{
String s = "hello";
String rev = "";
for(int i =s.length()-1;i>=0;i--)
{
rev = rev +s.charAt(i);

}
if(s.equals(rev))
{
System.out.println("This is palindrome");
}
else
{
System.out.println("This is not palindrome");
}
}
}