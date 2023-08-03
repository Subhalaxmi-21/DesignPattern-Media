package solid.live.dip;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReaderClass implements Reader{
//    String filepath;
//    public NetworkReaderClass(String filepath){
//        this.filepath=filepath;
//    }
    URL url = null;
    public void setUrl(String protocol, String host,String file){

        try {
            url = new URL(protocol, host, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] read() {

        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();
        return inputString.getBytes();
    }
}
