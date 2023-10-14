package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Aquatic;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setFamily("Cats");
        lion.setAge(2);
        lion.setMammal(true);
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Animal dog = new Animal("Sou","Dogs",5,true);
        System.out.println(dog.getName());

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        // (int i = 1; i <= 5; i++) {

        // Press Maj+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        System.out.println(dog.isMammal());
        System.out.println(dog.getAge());
        Zoo myZoo= new Zoo("wildlife","Ariana");
        System.out.println(myZoo.getName());
        //myZoo.displayZoo();
        System.out.println(dog.toString());
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(Zoo.nbrAnimals);

        System.out.println(myZoo.animals.length);
        // myZoo.DisplayAnimals();
        // System.out.println(myZoo.searchAnimal(dog));
        //System.out.println(myZoo.removeAnimal(dog));
        System.out.println("------verif tab-----");
        System.out.println(myZoo.isZooFull());
        Zoo myZoo2= new Zoo("frigia","tunis");
        myZoo2.addAnimal(dog);
        myZoo2.addAnimal(lion);
        System.out.println(Zoo.nbrAnimals);
        System.out.println("------comparer tab-----");
        System.out.println(Zoo.comparerZoo(myZoo2,myZoo));
        System.out.println("------creation class-----");
        Dolphin dolphin=new Dolphin("paris",6,"Dilphino","haw",5,true);
        System.out.println(dolphin.toString());
        Penguin penguin = new Penguin("wiw2","batri9",12,true,"cold",25);
        System.out.println(penguin.toString());

        dolphin.swim();
        penguin.swim();




    }
}
