package doc_ghi_bien;

import java.io.*;

public class DocFile {
    public static void main(String[] args) {
        DataInputStream doc = null;

        try {
            doc = new DataInputStream(new FileInputStream("src/data1/dulieubien.txt"));
            int i = doc.readInt();
            double f = Math.round(doc.readFloat()*100)/100.0;
            double d = doc.readDouble();
            String name = doc.readUTF();

            System.out.println("i="+i);
            System.out.println("f="+f);
            System.out.println("d="+d);
            System.out.println("name: "+name);
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
