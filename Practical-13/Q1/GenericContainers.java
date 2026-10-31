class Box<T>{private T value;void set(T v){value=v;}T get(){return value;}}
class Pair<A,B>{A first;B second;Pair(A a,B b){first=a;second=b;}public String toString(){return first+" / "+second;}}
public class GenericContainers {static <T>T first(T[] a){return a.length==0?null:a[0];}public static void main(String[] args){Box<String> b=new Box<>();b.set("Java");Pair<Integer,String> p=new Pair<>(1,"One");System.out.println(b.get());System.out.println(p);System.out.println(first(new Integer[]{10,20}));}}
