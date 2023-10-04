import java.io.*;
import java.net.Socket;


public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Socket socket = new Socket("127.0.0.1", 3000);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        Message message = new Message("Leonel", 53208);
        out.writeObject(message);

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        message = (Message) in.readObject();

        System.out.println(message.getName() + "  " + message.getCod());

        in.close();
        out.close();
        socket.close();
    }
}