
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class NewEmpty{
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File sourceFile = new File("C:\\Users\\USER\\Documents\\DSC_4802 2.jpg");
        File destinationFile = new File("upload\\1.jpg");

        FileOutputStream fileOutputStream;
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile)) {
            fileOutputStream = new FileOutputStream(
                    destinationFile);
            int bufferSize;
            byte[] bufffer = new byte[512];
            while ((bufferSize = fileInputStream.read(bufffer)) > 0) {
                fileOutputStream.write(bufffer, 0, bufferSize);
            }
        }
        fileOutputStream.close();
    }
}