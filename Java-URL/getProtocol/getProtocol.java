import java.net.*;

public class getProtocol{
public static void main(String[] args) {
    URL url = new URL("https://github.com/tagiswild");
    System.out.println("Protocol: " + url.getProtocol());
}
}