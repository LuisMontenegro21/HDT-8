import java.util.List;
import java.util.LinkedList;
public class Control{
  public static void main(String[] args ){
    boolean finished = false;
    String input;
    View view;
    Reader reader = new Reader();

    List<String[]> list = new LinkedList<String[]>();

    while(!finished){
      view = new View();
      view.menu("start");
      input = view.input();
      if(input == "exit"){
        System.exit(0);
      }
      list = reader.readFileJCF(input);
      finished = true;
    }
    finished = false;
    while(!finished){
      view = new View();
      view.menu("show");
      input = view.input();
    }
  }
}
