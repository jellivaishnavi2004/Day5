import java.util.Scanner;
class InputMonthNumberIf{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int month;
month=scob.nextInt();
if(month==0){System.out.println("sunday");}
else if(month==1){System.out.println("january");}
else if(month==2){System.out.println("february");}
else if(month==3){System.out.println("march");}
else if(month==4){System.out.println("april");}
else if(month==5){System.out.println("may");}
else if(month==6){System.out.println("june");}
else if(month==7){System.out.println("july");}
else if(month==8){System.out.println("august");}
else if(month==9){System.out.println("september");}
else if(month==10){System.out.println("october");}
else if(month==11){System.out.println("november");}
else if(month==12){System.out.println("december");}
else{System.out.println("invalid");}
}
}