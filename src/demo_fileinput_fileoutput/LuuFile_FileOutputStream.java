package demo_fileinput_fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LuuFile_FileOutputStream {
    public static void main(String[] args) {
        FileOutputStream ghi = null;

        try {
            ghi = new FileOutputStream("src/data1/dulieu.txt");
            String dulieu = "Ghi du lieu voi FileOutputStream";
            ghi.write(dulieu.getBytes(StandardCharsets.UTF_8));
            System.out.println("Da ghi xong");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                ghi.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
