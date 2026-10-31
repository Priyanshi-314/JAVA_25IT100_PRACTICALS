@FunctionalInterface interface Notifier {void send(String message);}
interface Urgent {}
class EmailSender implements Notifier {public void send(String m){System.out.println("Email: "+m);}}
class SmsSender implements Notifier,Urgent {public void send(String m){System.out.println("SMS: "+m);}}
public class NotificationSenders {public static void main(String[] args){Notifier[] a={m->System.out.println("Email: "+m),new SmsSender()};for(Notifier n:a){n.send("Meeting at 10");if(n instanceof Urgent)n.send("URGENT: Meeting at 10");}}}
