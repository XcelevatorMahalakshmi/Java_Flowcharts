import java.util.*;
public class FCP029{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int sum=0;
while(a>0){
int digit=a%10;
sum+=digit;
a=a/10;
}
System.out.println(sum);
}
}
