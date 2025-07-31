import java.util.*;
public class FCP018{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int bs=scan.nextInt();
int hra=0;
int da=0;
int gs=0;
if(bs<=10000){
hra=(int)(bs*0.2);
da=(int)(bs*0.8);
gs=bs+hra+da;
}
else if(bs<=20000){
hra=(int)(bs*0.25);
da=(int)(bs*0.9);
gs=bs+hra+da;
}
else if(bs>20000){
hra=(int)(bs*0.3);
da=(int)(bs*0.95);
gs=bs+hra+da;
}
System.out.println(gs);
}
}





