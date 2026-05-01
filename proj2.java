import java.util.Scanner;
public class proj2 {
    public static void main(String[] args) {
        
        System.out.println("---Welcome to baseCase Shop---");
        System.out.print("How many items do you want to purchase ? : ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();




      if(n>5)
      {
        System.out.println("Maximum 5 items are allowed !!!");
      }
else
{



        String[] arr1 = new String[n];
        int[] arr2 = new int[n];
        double[] arr3 = new double[n];
         double subt=0;
   
          for(int i =0; i< n; i++){

          System.out.print("Enter product "+ (i+1)+ " Name : ");
          Scanner take1 = new Scanner(System.in);
          arr1[i] = take1.nextLine();
          System.out.print("Enter price :");
          Scanner take2 = new Scanner(System.in);
          arr3[i] = take2.nextDouble();
          System.out.print("Enter Quantity :");
          Scanner take3 = new Scanner(System.in);
          arr2[i] = take3.nextInt();

   subt+= arr2[i] * arr3[i];




          }

          double disc;

   if(subt > 100)
   {
        disc = subt * 0.20;
   }
   else if(subt > 50)
   {
    disc = subt * 0.10;
   }
   else{
    disc = subt * 0.05;
   }


   int delivery = (subt < 50) ? 10:0;



          System.out.println("---Final Receipt---");
          System.out.println("");


       for(int w=0; w<n; w++)
       {
           System.out.println("Item "+(w+1) +" :" + " "+arr1[w]+"-"+" "+arr2[w]+" "+"X"+" "+ arr3[w]+" "+"="+" "+arr2[w]*arr3[w]);
       }
       System.out.println("");
       System.out.println("Subtotal: "+subt);
       System.out.println("Discount applied :"+disc);
       System.out.println("Delivery Fee : "+delivery);
       System.out.println("");
       System.out.println("Final Total : "+ (subt-disc+delivery));
        System.out.println("");
         System.out.println("------------------------------");







    }
}
    
}
