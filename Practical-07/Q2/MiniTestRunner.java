import java.lang.annotation.*;import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.METHOD)@interface Run {}
class SampleTests {@Run public void testOne(){System.out.println("Test one passed");}public void helper(){System.out.println("Helper skipped");}@Run public void testTwo(){System.out.println("Test two passed");}}
public class MiniTestRunner {public static void main(String[] args)throws Exception{Object obj=new SampleTests();int count=0;for(Method m:obj.getClass().getDeclaredMethods())if(m.isAnnotationPresent(Run.class)){m.invoke(obj);count++;}System.out.println("Tests ran: "+count);}}
