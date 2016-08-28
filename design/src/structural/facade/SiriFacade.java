package structural.facade;

public class SiriFacade {

    PhoneBook pb;
    Phone p;
    Facebook fb;
    int id;
    

    SiriFacade(int ID){
        pb = new PhoneBook();
        p = new Phone();
        fb = new Facebook();
        this.id = ID;

    }
    
    void callSomebody(){
        pb.setName();
        pb.getPhoneNumber();
        p.call(); 
    }
    
    void addToContacts(){
        pb.setName();
        pb.setPhoneNumber();
        fb.getThumbnail(id);
        pb.setThumbnail();
    }

}
