import java.util.*;
public class TollBooth {
 record Vehicle(String number,String type) {}
 public static void main(String[] args){ Scanner sc=new Scanner(System.in); int total=0,bike=0,car=0,truck=0;
  while(true){ System.out.print("Vehicle number (done to stop): "); String n=sc.next(); if(n.equalsIgnoreCase("done")) break;
   System.out.print("Type (bike/car/truck): "); String t=sc.next().toLowerCase(); Vehicle v=new Vehicle(n,t);
   int toll=switch(v.type()){case "bike"->20;case "car"->50;case "truck"->150;default->0;};
   if(toll==0){System.out.println("Invalid type");continue;} total+=toll;
   switch(t){case "bike"->bike++;case "car"->car++;case "truck"->truck++;}
  }
  String most=bike>=car&&bike>=truck?"bike":car>=truck?"car":"truck";
  System.out.println("Total toll: "+total);System.out.println("Most frequent: "+most);
 }
}
