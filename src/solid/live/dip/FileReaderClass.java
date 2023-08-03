package solid.live.dip;

import net.iharder.Base64;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderClass implements Reader{
    String filepath;
    public FileReaderClass(String filepath){
        this.filepath=filepath;
    }
    @Override
    public byte[] read() {
        String linesRead="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.filepath));
            String aLine;

            while ((aLine = reader.readLine()) != null) {
                linesRead=linesRead.concat(aLine);
            }
            reader.close();
            return linesRead.getBytes();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return linesRead.getBytes();
    }
}
