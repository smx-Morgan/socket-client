import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *learning socket code is from the website:
 * <p>
 * https://blog.csdn.net/qq_27525611/article/details/102633014
 * <p>
 * @author Mengxin Song 300595904
 */
public class Server {
    // there is another java class named Server_Thread

    public static void main(String[] args) throws Exception {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Welcome to my server\n" +
                    "my student ID is 300595904\n"+
                     "my server is waiting for Clients");
            // using while to keep accept client
            int i = 1;
            String ip = (InetAddress.getLocalHost().getHostAddress());
            System.out.println("The ip address is :"+ip);
            while (true) {
                // server accept the client connection request
                Socket serverClient = serverSocket.accept();
                System.out.println(" Connected to the Server Successfully!\n"+ip+" says");
                // send the request to a separate thread and create a new one
                new Server_Thread(serverClient).start();
                //new Thread(() -> { try{
                // printwriter
                // }).start();
                System.out.println("this is the "+i+" require");
                // i++ too show that how many number of clint there
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
