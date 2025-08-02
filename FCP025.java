import java.util.*;
public class FCP025{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=0;
for(int i=1;i<=a;i=i+1){
if(i%2!=0){
b=b+i;
}
}
System.out.println(b);
}
}