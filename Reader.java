
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;


public class Reader {


    private File file;
    private Scanner scan;
    private List<String[]> list, newlist;
    private String[] data, word2;
    private String line, regex = ",";

    /**
     * Metodo que lee e imprime el contenido del archivo
     * @param file_to_read 
     */
    public List<String[]> readFileJCF(String file_to_read){
            list = new LinkedList<String[]>();
            newlist = new LinkedList<String[]>();
            file = new File(file_to_read);
            try {
                scan = new Scanner(file); 
                while(scan.hasNextLine()){
                    line = scan.nextLine();
                    data = line.split(regex);
                    list.add(data);
                    for(String[] patient: list){
                        if(patient[2].toLowerCase().equals("a")){
                            newlist.add(0, patient);
                        }
                        else if(patient[2].toLowerCase().equals("b")){
                            newlist.add(1, patient);
                        }
                        else if(patient[2].toLowerCase().equals("c")){
                            newlist.add(2, patient);
                        }
                        else if(patient[2].toLowerCase().equals("d")){
                            newlist.add(3, patient);
                        }
                        else if(patient[2].toLowerCase().equals("e")){
                            newlist.add(4, patient);
                        }
                        else{
                            newlist.add(0, patient);
                        }
                        System.out.println(Arrays.deepToString(patient));
                    }
                }
                
                for(String[] i : newlist){
                    System.out.println(Arrays.deepToString(i));
                }
                
                
            return newlist;
                
            } 
            catch (IOException e) {
                inexistant();
                return null;
            }
    }

    /**
     * Metodo que lee el texto ingresado 
     * @param text
     */
    public void readFileVectorHeap(String text){
        try {
            scan = new Scanner(new File(text));
            while(scan.hasNextLine()){
                line = scan.nextLine();
                word2 = line.split(regex);
                
            }
            
        } catch (IOException e) {
            inexistant();
        }
    }

    private void inexistant(){
        System.out.println("El archivo no existe");
    }

    /**
     * Es para verificar si existe o no el archivo ingresado
     * @param files
     * @return boolean
     */
    public boolean fileExists(String file){
        return new File(file).isFile();
    }
    
}
