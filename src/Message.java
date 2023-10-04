import java.io.Serializable;

public class Message implements Serializable
{
    private String name;
    private int cod;

    public Message(String name, int cod)
    {
        this.name = name;
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
