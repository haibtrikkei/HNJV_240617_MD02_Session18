package demo_buffered_out_input;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GhiFile {
    public static void main(String[] args) {
        BufferedOutputStream ghi = null;

        try {
            ghi = new BufferedOutputStream(new FileOutputStream("src/data1/dulieubuffered.txt"));
            ghi.write("Doc ghi du lieu voi BufferedInputStream va BufferedOutputStream".getBytes(StandardCharsets.UTF_8));
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
