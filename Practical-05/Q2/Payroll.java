abstract class Employee {String name,id;Employee(String n,String i){name=n;id=i;}abstract double monthlySalary();}
class FullTime extends Employee {double salary;FullTime(String n,String i,double s){super(n,i);salary=s;}double monthlySalary(){return salary;}}
class PartTime extends Employee {int hours;double rate;PartTime(String n,String i,int h,double r){super(n,i);hours=h;rate=r;}double monthlySalary(){return hours*rate;}}
class Intern extends Employee {double stipend;Intern(String n,String i,double s){super(n,i);stipend=s;}double monthlySalary(){return stipend;}}
public class Payroll {public static void main(String[] args){Employee[] a={new FullTime("A","E1",30000),new PartTime("B","E2",40,200),new Intern("C","E3",8000)};double total=0;for(Employee e:a){System.out.println(e.name+": "+e.monthlySalary()+(e instanceof Intern?" (Intern)":""));total+=e.monthlySalary();}System.out.println("Total: "+total);}}
