import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String []args) throws IOException, ClassNotFoundException
    {
        ServerSocket server = new ServerSocket(3000);

        Socket socket = server.accept();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        Message message = (Message) in.readObject();
        System.out.println(message.getName() + " "  +  message.getCod());

        message.setName("Marimba Code");
        message.setCod(5344);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(message);


        server.close();
        socket.close();
        in.close();
        out.close();
    }
}
