import java.util.*;
public class VendingMachine {
 enum Coin { ONE, TWO, FIVE, TEN }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int total=0; final int price=15;
  while(total<price){ System.out.print("Enter coin (ONE/TWO/FIVE/TEN): "); Coin c=Coin.valueOf(sc.next().toUpperCase());
   total += switch(c){case ONE->1; case TWO->2; case FIVE->5; case TEN->10;};
   System.out.println("Total: "+total);
  }
  System.out.println("Paid. Change: "+(total-price));
 }
}
