import java.util.*;
public class Isprime
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(isprime(n,2)==1)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
public static int isprime(int n,int i)
{
if(n==2)
return 1;
if(n%i==0)
return 0;
if(i*i>n)
return 1;
return isprime(n,i+1);
}
}

output1:

7
7 is a prime number

output2:

15
15 is not a prime number