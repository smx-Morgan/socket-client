import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
// learning client from https://blog.csdn.net/qq_27525611/article/details/102633014
public class Client {
    public static String ip;
    public static int port;
    public Client() {
        try {
            Socket socket = new Socket(ip,port);
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String message;
            while((message = bufferedReader.readLine()) != null) {
                System.out.println(message);
            }
            socket.close();
        } catch (UnknownHostException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        for (int i = 0; i < 10; i++) {
            new Client();
        }

    }
}
