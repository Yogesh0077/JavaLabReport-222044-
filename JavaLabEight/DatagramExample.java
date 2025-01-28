package labeight;


    
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;

public class DatagramExample {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        //constructor to create a datagram socket
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        int port = 5252;
        byte buf[]={12,13};
        byte buf1[]= new byte[2];
        DatagramPacket dp = new DatagramPacket(buf, 1, address,port);
        DatagramPacket dptorec = new DatagramPacket(buf1, 1);
        //connect method()
        socket.connect(address,port);
        // isBound() method
        System.out.println("IsBound: "+ socket.isBound());
        // isConnected() method
        System.out.println("isConnected: "+socket.isConnected());
        // getintaddress() method
        System.out.println("InetAddress: "+ socket.getInetAddress());
        //getport() method
         System.out.println("Port: "+ socket.getPort());
         // getremotesocketAddress() method
         System.out.println("Remote socket address: "+ socket.getRemoteSocketAddress());
         //getLocalSocketAddress() method
         System.out.println("Local socket Address:"+ socket.getLocalSocketAddress());
         //send() method
         socket.send(dp);
         System.out.println("...packet sent sucessfully... ");
         //Receive() method
        //  socket.receive(dptorec);
         System.out.println("Receive packet data: "+ Arrays.toString(dptorec.getData()));
         //getlocalport() method
         System.out.println("Local port: "+ socket.getLocalPort());
         //getlocaladdress() method
         System.out.println("Local Address "+ socket.getLocalAddress());
         //setSOTimeout() method 
         socket.setSoTimeout(50);
         //getSotimeout() method
         System.out.println("So timeout:" + socket.getSoTimeout()); 
    }
}



