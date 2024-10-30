import java.util.Scanner;
class ReversePattren{
public static void printReversePattern(char c,int n){
for(int i=n;i>=1;i--)
{
System.out.print("\n");
for(int j=1;j<=i;j++)
System.out.print(c);
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printReversePattern(ch,row);
}
}
