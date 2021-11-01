public class Main {

    public static void main(String[] args) {

        IndividualHolder ih = new IndividualHolder(AccountHolder.nextAvailableID(), "0000 Home Ave", "Joshua", "000-00-0000");
        CorporateHolder ch = new CorporateHolder(AccountHolder.nextAvailableID(), "1111 Work Lane", "Jacob");

        Account acc_ih = new Account(ih, 500.0);
        Account acc_ch = new Account(ch, 1000.0);

        System.out.println(acc_ih.getHolder().id);
        System.out.println(acc_ih.getBalance());
        try {
            acc_ih.withdraw(501);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(acc_ih.getBalance());

        System.out.println(acc_ch.getHolder().id);
        System.out.println(acc_ch.getBalance());
    }
}
