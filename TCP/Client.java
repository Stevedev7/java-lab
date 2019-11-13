import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 6969);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "", s2 = "";

        while(!s1.equals("stop")){
            s2 = br.readLine();
            dos.writeUTF(s2);
            dos.flush();

            s1 = dis.readUTF();
            System.out.println("Server says: " + s1);
        }
        s.close();
        dos.close();
    }
}
