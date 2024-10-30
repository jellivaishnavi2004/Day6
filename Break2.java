import java.util.Scanner;
class Break2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=0;
while(i<25){
System.out.print(i+" ");
i++;
if(i%5==0)break;
}
}
}