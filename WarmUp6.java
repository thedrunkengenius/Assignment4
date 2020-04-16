import java.io.*;
import java.util.*;

public class WarmUp6 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (new File("newText2.txt"));
        ArrayList <String> newList = new ArrayList<>();

        while(s.hasNextLine()){
            newList.add(s.nextLine());
        }


        sortByNumbers(newList, 8 , 9);
    }


    public static void  sortByNumbers (ArrayList<String> newList, int a, int b ) throws IOException {

        FileWriter fw = new FileWriter("newText3.txt");
        BufferedWriter bw = new BufferedWriter (fw);

        for (int i = 0; i < newList.size(); i ++){
            if(newList.get(i).length() != a || newList.get(i).length() != b ){
                newList.remove(newList.get(i));
            }
            bw.write(newList.get(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();





    }
}
