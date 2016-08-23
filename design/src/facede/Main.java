package facede;

public class Main {

    public static void main(String[] args) {
        
        //Add someone to phonebook and make a phone call
        
        System.out.println("*** Original ***\n");
        Facebook fb = new Facebook();
        PhoneBook pb = new PhoneBook();
        Phone p = new Phone();

        pb.setName();
        pb.setPhoneNumber();
        fb.getThumbnail(123);
        pb.setThumbnail();

        pb.setName();
        pb.getPhoneNumber();
        p.call(); 
        
        System.out.println("\n*** Use facede ***");
        
        SiriFacade siri = new SiriFacade(123);
        siri.addToContacts();
        siri.callSomebody();

    }

}
