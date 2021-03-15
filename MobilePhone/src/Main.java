public class Main {
    public static void main(String[] args){
        MobilePhone my = new MobilePhone("23456");
        System.out.println(my.addNewContact(new Contact("E","123456")));
        System.out.println(my.addNewContact(new Contact("E","123456")));
    }
}
