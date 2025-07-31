import java.util.*;
public class FCP021{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int e=scan.nextInt();
int f=scan.nextInt();
int g=scan.nextInt();
int h=scan.nextInt();
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
if(e>max){
secondmax=max;
max=e;
}
else if(e>secondmax){
secondmax=e;
}
if(f>max){
secondmax=max;
max=f;
}
else if(f>secondmax){
secondmax=f;
}
if(g>max){
secondmax=max;
max=g;
}
else if(g>secondmax){
secondmax=g;
}
if(h>max){
secondmax=max;
max=h;
}
else if(h>secondmax){
secondmax=h;
}
System.out.println(secondmax);
}
}