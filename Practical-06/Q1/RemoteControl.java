interface Switchable {void on();void off();default void toggle(){off();on();}}
class Fan implements Switchable {boolean state;public void on(){state=true;System.out.println("Fan ON");}public void off(){state=false;System.out.println("Fan OFF");}}
class Light implements Switchable {boolean state;public void on(){state=true;System.out.println("Light ON");}public void off(){state=false;System.out.println("Light OFF");}}
@FunctionalInterface interface SwitchRule {boolean maySwitchOn(String device,int hour);}
public class RemoteControl {public static void main(String[] args){Switchable[] a={new Fan(),new Light()};for(Switchable s:a)s.toggle();SwitchRule r1=new SwitchRule(){public boolean maySwitchOn(String d,int h){return h>=6&&h<=22;}};SwitchRule r2=(d,h)->h>=6&&h<=22;System.out.println(r1.maySwitchOn("Fan",10));System.out.println(r2.maySwitchOn("Light",23));}}
