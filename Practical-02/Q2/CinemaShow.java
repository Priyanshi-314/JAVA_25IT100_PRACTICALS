public class CinemaShow {
 private String title;private int seatsAvailable;private final int capacity;private static int totalBooked=0;
 public CinemaShow(String title,int capacity){this.title=title;this.capacity=capacity;seatsAvailable=capacity;}public CinemaShow(String title){this(title,100);}
 public boolean book(int n){if(n>0&&n<=seatsAvailable){seatsAvailable-=n;totalBooked+=n;return true;}return false;}
 public void cancel(int n){if(n>0)seatsAvailable=Math.min(capacity,seatsAvailable+n);}public int getSeatsAvailable(){return seatsAvailable;}public static int getTotalBooked(){return totalBooked;}
 public static void main(String[] args){CinemaShow s=new CinemaShow("Movie",5);System.out.println(s.book(3)+" seats: "+s.getSeatsAvailable());System.out.println(s.book(4)+" seats: "+s.getSeatsAvailable());s.cancel(1);System.out.println("Seats: "+s.getSeatsAvailable());System.out.println("Total booked: "+getTotalBooked());}
}
