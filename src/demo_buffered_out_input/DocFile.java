package demo_buffered_out_input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DocFile {
    public static void main(String[] args) {
        byte[] dataRead;
        BufferedInputStream doc = null;

        try {
            doc = new BufferedInputStream(new FileInputStream("src/data1/dulieubuffered.txt"));
            dataRead = doc.readAllBytes();
            System.out.println(new String(dataRead));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                doc.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
