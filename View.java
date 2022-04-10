import java.util.Scanner;

public class View{
  private Scanner scan;
  
  public View(){
    scan = new Scanner(System.in);
  }

  public void menu(String command){
    if(command == "start"){
      System.out.println("Bienvenido al sistema de atención" + "\nIngrese el archivo de los pacientes: ");
    }
    else if(command == "show"){
      System.out.println("La lista de pacientes es la siguiente: ");
    }
    else if(command == "next"){
      System.out.println("Ingrese -next- para pasar al siguiente paciente: ");
    }
    
  }

  public String input(){
    return scan.next();
  }


}
