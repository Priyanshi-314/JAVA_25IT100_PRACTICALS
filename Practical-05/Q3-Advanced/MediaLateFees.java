abstract class Media {String title;int lateDays;Media(String t,int d){title=t;lateDays=d;}abstract double lateFee();}
class Book extends Media {Book(String t,int d){super(t,d);}double lateFee(){return lateDays*2.0;}}
class DVD extends Media {DVD(String t,int d){super(t,d);}double lateFee(){return lateDays*5.0;}}
class Magazine extends Media {Magazine(String t,int d){super(t,d);}double lateFee(){return lateDays*1.5;}}
public class MediaLateFees {public static void main(String[] args){Media[] batch={new Book("Java",3),new DVD("Film",2),new Magazine("Tech",4)};double total=0;for(Media m:batch){System.out.println(m.title+": "+m.lateFee());total+=m.lateFee();}System.out.println("Total fees: "+total);}}
