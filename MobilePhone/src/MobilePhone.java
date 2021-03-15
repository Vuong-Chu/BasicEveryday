import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        myContacts = new ArrayList<>();
        myContacts.add(new Contact("My Name",myNumber));
    }

    public boolean addNewContact(Contact contact){
            if(findContact(contact)==-1){
                myContacts.add(contact);
                return true;
            }else{
                return false;
            }
    }

    public boolean updateContact(Contact contact1, Contact contact2){
            int index = findContact(contact1);
            if (index != -1) {
                myContacts.add(index, contact2);
                return true;
            }else{
                return false;
            }
    }

    public boolean removeContact(Contact contact){
            if (findContact(contact) != -1) {
                myContacts.remove(contact);
                return true;
            }else{
                return false;
            }
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name){
        if(myContacts!=null) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if(index!=-1){
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        if(myContacts==null){
            return;
        }else{
            for(int i=1; i<myContacts.size(); i++){
                System.out.printf("%d. %s -> %s\n",i,myContacts.get(i).getName(),myContacts.get(i).getPhoneNumber());
            }
        }
    }
}
