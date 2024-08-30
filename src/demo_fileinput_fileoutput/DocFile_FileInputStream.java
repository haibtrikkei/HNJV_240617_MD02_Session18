package demo_fileinput_fileoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFile_FileInputStream {
    public static void main(String[] args) {
        FileInputStream doc = null;

        try {
            doc = new FileInputStream("src/data1/dulieu.txt");
            int i;
            while((i=doc.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                doc.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
