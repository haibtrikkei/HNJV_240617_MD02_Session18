package doc_ghi_kitu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GhiBaiTho {
    public static void main(String[] args) {
        BufferedWriter ghi = null;

        try {
            ghi = new BufferedWriter(new FileWriter("src/data1/baitho.txt"));
            ghi.write("Bài thơ: Nam Quốc Sơn Hà");
            ghi.write("\n\t\t Tác giả: Lý Thường Kiệt");
            ghi.write("\nSông núi nước nam vua ham ở");
            ghi.write("\nRành rành định phận tại sách trời");
            ghi.write("\nCớ sao lũ giặc sang xâm phạm");
            ghi.write("\nChúng bay sẽ bị đánh tơi bời");
            System.out.println("Đã ghi xong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                ghi.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
