package packagedapp;
import packagedapp.service.TaskService;import packagedapp.model.Task;import java.nio.file.*;
public class Main {public static void main(String[] args)throws Exception{Path file=Paths.get("tasks.txt");TaskService s=new TaskService();s.load(file);s.add("Complete Java practical");s.save(file);for(Task t:s.all())System.out.println(t.getName());}}
