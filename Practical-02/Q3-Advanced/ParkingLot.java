public class ParkingLot {
 private int twoWheelers=0,fourWheelers=0;private final int twoCap,fourCap;private static long revenue=0;
 public ParkingLot(int twoCap,int fourCap){this.twoCap=twoCap;this.fourCap=fourCap;}
 public boolean park(String type){if(type.equalsIgnoreCase("two")&&twoWheelers<twoCap){twoWheelers++;revenue+=20;return true;}if(type.equalsIgnoreCase("four")&&fourWheelers<fourCap){fourWheelers++;revenue+=40;return true;}System.out.println("Full");return false;}
 public void leave(String type){if(type.equalsIgnoreCase("two"))twoWheelers=Math.max(0,twoWheelers-1);else if(type.equalsIgnoreCase("four"))fourWheelers=Math.max(0,fourWheelers-1);}
 public static void main(String[] args){ParkingLot p=new ParkingLot(2,1);System.out.println(p.park("two"));System.out.println(p.park("two"));System.out.println(p.park("two"));System.out.println(p.park("four"));p.leave("two");System.out.println("Two: "+p.twoWheelers+", Four: "+p.fourWheelers+", Revenue: "+revenue);}
}
