import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write(97);
        fw.write("\nVipul\n");
        fw.write(new char[] { 'a', 'b', 'c' });
        fw.flush();
        fw.close();
        FileReader fr = new FileReader(f);
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();
    }
}
