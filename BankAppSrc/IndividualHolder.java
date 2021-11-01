public class IndividualHolder extends AccountHolder{

    //attributes
    private String name;
    private String SSN;

    //operations
    public IndividualHolder(int id, String address, String name, String SSN) {
        super(id, address);
        this.name = name;
        this.SSN = SSN;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

}
