package doc_ghi_kitu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocBaiTho {
    public static void main(String[] args) {
        BufferedReader read = null;

        try {
            read = new BufferedReader(new FileReader("src/data1/baitho.txt"));
            String line;

            while((line=read.readLine())!=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                read.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
