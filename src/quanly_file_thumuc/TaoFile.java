package quanly_file_thumuc;

import java.io.File;
import java.io.IOException;

public class TaoFile {
    public static void main(String[] args) throws IOException {
        File f = new File("src/data1/data.txt");

        if(!f.exists()){
            boolean blCreated = f.createNewFile();
            if(blCreated)
                System.out.println("Da tao xong file");
            else
                System.out.println("Khong tao duoc file");
        }else{
            System.out.println("File da ton tai");
        }
    }
}
