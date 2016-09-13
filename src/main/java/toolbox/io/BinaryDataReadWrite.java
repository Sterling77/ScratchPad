package toolbox.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Letricia on 7/28/16.
 */
public class BinaryDataReadWrite {  //WID?CHANGES PACKETS INTO BINARY AND BREAKS THEM UP FROM SENDER TO RECVR
    public static void main(String[] args) {
        Path myFilePath = Paths.get("StreamedFileReadWrite.txt");
        String myFileContent = "We are writing and reading file content using a Binary Stream.";
        byte[] myFileContentByteArray = myFileContent.getBytes();

        // write the file content using unbuffered binary stream
        try {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(myFilePath));
            out.write(myFileContentByteArray); //BYTE array is bits of characters
            out.flush();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // read file using unbuffered binary stream
        try {
            InputStream in = Files.newInputStream(myFilePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
