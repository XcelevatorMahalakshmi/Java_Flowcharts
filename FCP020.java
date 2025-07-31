import java.util.*;
public class FCP020{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int max=a;
int secondmax=0;
if(b>max){
secondmax=max;
max=b;
}
else if(b>secondmax){
secondmax=b;
}
if(c>max){
secondmax=max;
max=c;
}
else if(c>secondmax){
secondmax=c;
}
if(d>max){
secondmax=max;
max=d;
}
else if(d>secondmax){
secondmax=d;
}
System.out.println(secondmax);
}
}