public class CorporateHolder extends AccountHolder{

    //attributes
    private String contact;

    //operations
    public CorporateHolder(int id, String address, String contact) {
        super(id, address);
        this.contact = contact;
    }

    //getters and setters
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
