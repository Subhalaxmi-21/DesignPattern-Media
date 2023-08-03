package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encodeWithFiles() {
        FileReaderClass readFile = new FileReaderClass("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        String encodedLine = Base64.encodeBytes(readFile.read());
        FileWriterClass writeFile = new FileWriterClass("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
        writeFile.write(encodedLine);
    }

    public void encodeBasedOnNetworkAndDatabase() {
        NetworkReaderClass readStream=new NetworkReaderClass();
        readStream.setUrl("http", "myfirstappwith.appspot.com", "index.html");
        String encodedString = Base64.encodeBytes(readStream.read());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}

