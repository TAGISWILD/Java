import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
import java.time.LocalTime;
class server {
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            LocalTime time = LocalTime.now();
            LocalTime t = LocalTime.of(time.getHour()+0,time.getMinute()+0, time.getSecond()+30);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print(">");
                String str = sc.nextLine();
                dout.writeUTF(str);
                String msg = dis.readUTF();
                System.out.println("Message from client: "+msg);

            }
        }
        catch(Exception e){
            System.out.println("Error starting server....");
        }
    }
}
