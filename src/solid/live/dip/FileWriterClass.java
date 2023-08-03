package solid.live.dip;
import java.io.*;

public class FileWriterClass {
    String filepath;

    public FileWriterClass(String filepath) {
        this.filepath = filepath;
    }

    public void write(String encodedLine) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            writer.write(encodedLine);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
