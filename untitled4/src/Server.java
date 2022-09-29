import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(8080);
        Socket s = serversocket.accept();
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String stroka = bf.readLine();
        System.out.println(stroka);
        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println("bbbb");
        out.flush();
    }
}