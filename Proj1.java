import java.util.Scanner;
public class Proj1{
public static void main(String[] args) {
   System.out.println("---Welcome to the Wizard Shop ---");
   System.out.print("Enter product name : ");
   Scanner sc = new Scanner(System.in);
   String s= sc.nextLine();
   System.out.print("Enter Unit Price : ");
   Scanner j = new Scanner(System.in);
   Float f= j.nextFloat();
   System.out.print("Enter Quantity : ");
   Scanner c = new Scanner(System.in);
   int q= c.nextInt();

   float Discount_Rate = 0.15f;

     float Subtotal = f * q;
     float discount = Subtotal * Discount_Rate;
     float last = Subtotal - discount;
     int l_last = (int) last;

     System.out.println("---FInal receipt---");
     System.out.println("Item : "+s);
     System.out.println("Subtotal : $"+Subtotal);
     System.out.println("Discount applied : $"+discount);
     System.out.println("Total (Rounded Down) : $"+l_last);

}
}