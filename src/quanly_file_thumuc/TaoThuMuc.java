package quanly_file_thumuc;

import java.io.File;

public class TaoThuMuc {
    public static void main(String[] args) {
        File f = new File("src/data1");
        if(!f.exists()){
            boolean blCreated = f.mkdir();
            if(blCreated)
                System.out.println("Da tao thu muc");
            else
                System.out.println("Khong tao duoc thu muc");
        }else{
            System.out.println("Thu muc da ton tai");
        }
        System.out.println("Duong dan tuyet doi cua thu muc nay: "+f.getAbsolutePath());
    }
}
