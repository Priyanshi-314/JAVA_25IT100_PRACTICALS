package discount;
import java.util.*;
interface DiscountRule {double apply(double price);}
public class Main {public static void main(String[] args){Scanner sc=new Scanner(System.in);List<Double> prices=List.of(100.0,250.0,500.0);System.out.println("1. 10% off  2. Flat 20 off  3. No discount");int choice=sc.nextInt();DiscountRule rule=switch(choice){case 1->p->p*0.90;case 2->p->Math.max(0,p-20);default->p->p;};for(double p:prices)System.out.println(p+" -> "+rule.apply(p));}}
