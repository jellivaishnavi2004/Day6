import java.util.Scanner;
class Factors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
for(int i=1;i<=inputNum;i++)
{
if(inputNum%i==0)
{
System.out.print(i);
if(i!=inputNum)System.out.print(",");
}
}
}
}
