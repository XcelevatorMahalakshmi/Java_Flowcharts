import java.util.*;
public class FCP028{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a==0){
System.out.println(1);
}
else if(a<10){
System.out.println(1);
}
else if(a<100){
System.out.println(2);
}
else if(a<1000){
System.out.println(3);
}
else if(a<10000){
System.out.println(4);
}
else if(a<100000){
System.out.println(5);
}
else if(a<1000000){
System.out.println(6);
}
else{
System.out.println(7);
}
}
}
