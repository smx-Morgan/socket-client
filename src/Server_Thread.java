import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
/**
 *learning from :https://www.cnblogs.com/zhuchengyi/articles/5614660.html
 */
public class Server_Thread extends Thread{
    static String hello = "From Server: Hello world";
    Socket socket;

    public Server_Thread(Socket s){
        socket = s;
    }

    @Override
    public void run() {
        try {
            String ip = (InetAddress.getLocalHost().getHostAddress());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String quote = pick_quote();
            // output the quote
            bufferedWriter.write(ip+" says : "+quote);
            bufferedWriter.flush();
            //Refresh the buffer stream
            bufferedWriter.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    private String pick_quote(){
        int math = (int)(Math.random()*10);
        // randomly pick one quote
        String quote = "If Winter comes, can Spring be far behind ?";
        if(math<3){
             quote = "If Winter comes, can Spring be far behind ?";
        }else if (math<6){
             quote = "Keep calm and carry on!";
        }else{
             quote = "For my life too short for waiting";
        }

        String Return = "\nHello!\nMy Student ID:300595904\nthis is my server\n" +"There is a quote for you.)\n"+quote;
        return Return;
    }

}
