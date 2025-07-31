import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int secondmax=0;
if ((a>b && a<c) || (a>c && a<b)){
secondmax=a;
}
else if((b>a && b<c) || (b>c && b<a)){
secondmax=b;
}
else{
secondmax=c;
}
System.out.println(secondmax);
}
}
