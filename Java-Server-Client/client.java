import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalTime;
import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.DataInputStream;
public class client {
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",8080);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                String msg = dis.readUTF();
                System.out.println("Message from server: "+msg);
                System.out.print(">");
                String str = sc.nextLine();
                dout.writeUTF(str);
            }


        }
        catch(Exception e){
            System.out.println("Error connecting to server");

        }
    }
}
