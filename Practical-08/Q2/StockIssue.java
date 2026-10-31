import java.util.*;
class OutOfStockException extends Exception {int shortfall;OutOfStockException(int n){super("Shortfall: "+n);shortfall=n;}}
class InvalidQuantityException extends Exception {InvalidQuantityException(){super("Quantity must be positive");}}
class Warehouse {int stock=10;void issue(String item,int qty)throws OutOfStockException,InvalidQuantityException{if(qty<=0)throw new InvalidQuantityException();if(qty>stock)throw new OutOfStockException(qty-stock);stock-=qty;System.out.println("Issued "+qty+" "+item);}}
public class StockIssue {public static void main(String[] args){Warehouse w=new Warehouse();int[] requests={3,9,-2};for(int qty:requests)try{w.issue("item",qty);}catch(Exception e){System.out.println(e.getMessage());}System.out.println("Remaining: "+w.stock);}}
