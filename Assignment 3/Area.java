
import java.util.Scanner;
public class shape{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Choose shape: rectangle(r), square(s), parallelogram(p), rhombus(rh), trapezium(t)");
String shape=sc.next().toLowerCase();
double area=0;
switch(shape){
case "r":
System.out.print("Enter width: ");
double width=sc.nextDouble();
System.out.print("Enter height: ");
double height=sc.nextDouble();
area=width*height;
break;
case "s":
System.out.print("Enter side: ");
double side=sc.nextDouble();
area=side*side;
break;
case "p":
System.out.print("Enter base: ");
double baseP=sc.nextDouble();
System.out.print("Enter height: ");
double heightP=sc.nextDouble();
area=baseP*heightP;
break;
case "rh":
System.out.print("Enter diagonal1: ");
double d1=sc.nextDouble();
System.out.print("Enter diagonal2: ");
double d2=sc.nextDouble();
area=(d1*d2)/2;
break;
case "t":
System.out.print("Enter base1: ");
double base1=sc.nextDouble();
System.out.print("Enter base2: ");
double base2=sc.nextDouble();
System.out.print("Enter height: ");
double heightT=sc.nextDouble();
area=((base1+base2)*heightT)/2;
break;
default:
System.out.println("Invalid shape!");
sc.close();
return;
}
System.out.println("Area of "+shape+" = "+area);
sc.close();
}
}
