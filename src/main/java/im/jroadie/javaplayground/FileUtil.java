package im.jroadie.javaplayground;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileUtil {

    public static void main(String[] args) {
        unzip("/home/so/Downloads/Chrome/body-bg-c0b4fa.zip", "/home/so/Downloads/Chrome/extracted/body-bg-c0b4fa.zip");
        unzip("/home/so/Downloads/Chrome/abc.zip", "/home/so/Downloads/Chrome/extracted/abc.zip");
        unzip("/home/so/Downloads/Chrome/no-bg-image-anik.zip", "/home/so/Downloads/Chrome/extracted/no-bg-image-anik.zip");
        unzip("/home/so/Downloads/Chrome/branding_new.zip", "/home/so/Downloads/Chrome/extracted/branding_new.zip");
        unzip("/home/so/Downloads/Chrome/groovy-client-generated.zip", "/home/so/Downloads/Chrome/extracted/groovy-client-generated.zip");
    }

    /**
     * @param source    absolute filepath to unzip
     * @param destination root unzip folder
     * @return list of extracted files' path
     */
    public static void unzip(String source, String destination) {

        if(!source.endsWith(".zip"))
            throw new IllegalArgumentException(source.substring(source.lastIndexOf("/" + 1)) + " is zip file");

        String filename = source.substring(source.lastIndexOf("/") + 1, source.lastIndexOf(".zip"));
        File destFolder = new File(destination == null ? source.substring(0, source.lastIndexOf("/")) : destination);
        try {
            ZipInputStream zis = new ZipInputStream(new FileInputStream(source));
            ZipEntry zipEntry;
            while((zipEntry = zis.getNextEntry()) != null) {
                String zipEntryName = zipEntry.getName();
                if(destination != null)
                    zipEntryName = zipEntryName.replace(filename + "/", "");

                File destFile = new File(destFolder + "/" + zipEntryName);

                if(zipEntry.isDirectory()) {
                    destFile.mkdirs();
                } else {
                    new File(destFile.getParent()).mkdirs();
                    FileOutputStream fos = new FileOutputStream(destFile);
                    int len;
                    byte[] buffer = new byte[4096];
                    while((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();

                    if(destFile.getName().endsWith(".zip")) {
                        unzip(destFile.getAbsolutePath(), null);
                    }
                }
            }
            zis.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param filepath absolute file path to unzip
     */
    public static void unzip(String filepath) {
        unzip(filepath, null);
    }

}
