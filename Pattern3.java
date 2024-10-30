import java.util.Scanner;
class Pattern3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
printPattern(ch,row);
}
public static void printPattern(char c,int n){
int i=0;
while(i<=n){
i++;
printLine(c,i);
}
}
public static void printLine(char c,int col){
System.out.print("\n");
int j=0;
while(j<=n){
j++;
System.out.print(c);
}
}
}
/*
ch='*'
row=5
printPattern('*',5)
c='*',n=5
i=1:printLine('*',1):c='*',col=1:*
i=2:printLine('*',2):c='*',col=2:**
i=3:printLine('*',3):c='*',col=3:***
i=4:printLine('*',4):c='*',col=4:****
i=5:printLine('*',5):c='*',col=5:*****
*/