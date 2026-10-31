class DemoResource implements AutoCloseable {public void close(){System.out.println("Resource closed");}void work()throws Exception{throw new Exception("Original work error");}}
public class AutoCloseDemo {public static void main(String[] args){try(DemoResource r=new DemoResource()){r.work();}catch(Exception e){System.out.println("Reported error: "+e.getMessage());}}}
