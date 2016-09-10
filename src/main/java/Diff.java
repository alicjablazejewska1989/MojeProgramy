import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class Diff {

    public List<String> readFileToList(String filename)throws IOException{
        List<String> lines = new ArrayList<String>();
        try ( BufferedReader in = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return lines;
    }

    public void diff(String file1, String file2) throws IOException{
        List<String> lines1 = readFileToList(file1);
        List<String> lines2 = readFileToList(file2);
        for(String line: lines2){
                    if (!lines1.contains(line)){
                        System.out.println("+" + line);
                    }
        }
        for(String line: lines1){
            if (!lines2.contains(line)){
                System.out.println("-" + line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Diff diff = new Diff();
        diff.diff("xanadu.txt","xanaduNew.txt");

    }
}
