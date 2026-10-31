abstract class Shape {abstract double area();}
class Circle extends Shape {double r;Circle(double r){this.r=r;}double area(){return Math.PI*r*r;}}
class Rectangle extends Shape {double l,w;Rectangle(double l,double w){this.l=l;this.w=w;}double area(){return l*w;}}
class Triangle extends Shape {double b,h;Triangle(double b,double h){this.b=b;this.h=h;}double area(){return 0.5*b*h;}}
public class ShapeAreas {public static void main(String[] args){Shape[] a={new Circle(2),new Rectangle(4,3),new Triangle(5,2)};double total=0,largest=0;for(Shape s:a){double x=s.area();System.out.println(x);total+=x;largest=Math.max(largest,x);}System.out.println("Total: "+total+", Largest: "+largest);}}
