import java.io.*;

/**
 * Created by ablazejewska on 10.09.16.
 */
public class Task7 {

    public void copyBytes()

    { FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (
                FileNotFoundException e
                )
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void copyCharacters()

    {
        BufferedReader in = null;
        BufferedWriter out = null;
        //PrintWriter out = null;  %/ te komentarze zawierają komendy dla przypadku czyania całych linii pliku zamiast pojedynczych znaków

        try {
            in = new BufferedReader(new FileReader("xanadu.txt"));
            out = new BufferedWriter(new FileWriter("outagain.txt"));
            //out = new PrintWriter(new FileWriter(to))
            int c;

            while ((c = in.read()) != -1 ) { //while((c = in.readLine())!= null);
                out.write(c);
                //out.println(line);
            }
        } catch (
                FileNotFoundException e
                )
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Task7 io = new Task7();
        io.copyBytes();
        io.copyCharacters();
    }
}