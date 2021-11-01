import java.util.Random;

public class AccountHolder {

    //attributes
    protected int id;
    protected String address;

    //operations
    public AccountHolder(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public static int nextAvailableID(){
        return new Random().nextInt(1000000);
    }


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}