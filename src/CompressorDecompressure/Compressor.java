package CompressorDecompressure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent(); //writing data
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory+ "/CompressedFile.gz");
        GZIPOutputStream gzip = new GZIPOutputStream(fos); // write compressed data
        byte[] buffer = new byte[1024] ;
         // read this file byte until it is not equal to -1
        int len;
        while ((len = fis.read(buffer)) != -1){
            gzip.write(buffer,0,len);

        }
        gzip.close();
        fos.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        File path = new File("\"C:\\Users\\shukl\\Downloads\"");
        method(path);
    }
}