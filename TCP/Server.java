import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6969);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";

        while(!s1.equals("stop")){
            s1 = dis.readUTF();
            System.out.println("Client says: " + s1);
            s2 = br.readLine();
            dos.writeUTF(s2);
            dos.flush();
        }
        ss.close();
        dos.close();
    }
}
