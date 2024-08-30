package doc_ghi_bien;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile {
    public static void main(String[] args) {
        DataOutputStream ghi = null;
        try {
            ghi = new DataOutputStream(new FileOutputStream("src/data1/dulieubien.txt"));
            int i = 10;
            float f = 2.34F;
            double d = 2134324.324;
            long l = 23423324;
            String name = "Ghi file voi cac bien";

            ghi.writeInt(i);
            ghi.writeFloat(f);
            ghi.writeDouble(d);
            ghi.writeUTF(name);
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
