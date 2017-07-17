package logic;
import java.util.Scanner;
public class Odddum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int sum=0;
Scanner s=new Scanner(System.in);
System.out.print("enter the n numbers");
n=s.nextInt();
for(int i=0;i<=n;i++){
if(i%2!=0){
System.out.println(i);
sum=sum+i;
}
}
System.out.println(sum);
if(sum%2==0){
System.out.println(-1);
}
else {
	System.out.println(1);
}
	}
}

