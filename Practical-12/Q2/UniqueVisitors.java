import java.util.*;
public class UniqueVisitors {public static void main(String[] args){String[] logins={"riya","aman","riya","dev","neha","aman"};Set<String> all=new HashSet<>(Arrays.asList(logins));LinkedHashSet<String> order=new LinkedHashSet<>(Arrays.asList(logins));System.out.println("Unique count: "+all.size());int n=0;for(String name:order){if(n++==3)break;System.out.println(name);}}}
