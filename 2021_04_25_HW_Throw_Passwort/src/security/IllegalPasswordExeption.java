package security;

public class IllegalPasswordExeption extends Exception{
    private String [] messages;

    public IllegalPasswordExeption(String messages) {
        super(messages);
    }

    public String[] getMessages() {
        return messages;
    }
}
