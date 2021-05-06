import java.util.*;

public class LamdaFunction {

    public static void main(String[] args) {
        print(new Animal("Kangaroo", true, false), (Animal a) -> {return a.canHop();});
        print(new Animal("Kangaroo", true, false), a -> a.canHop());
        print(new Animal("Shark", false, true), new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return a.canSwim();
            }
        });

    }

    public static void print(Animal animal, CheckTrait checkTrait){
        if(checkTrait.test(animal)){
            System.out.println(animal);
        }
    }

}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop(){
        return canHop;
    }
    public boolean canSwim(){
        return canSwim;
    }
    public String toString(){
        return species;
    }
}

interface CheckTrait{
    boolean test(Animal a);
}
