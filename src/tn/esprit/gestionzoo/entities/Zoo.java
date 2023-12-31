package tn.esprit.gestionzoo.entities;


import tn.esprit.gestionzoo.exeptions.ZooFullException;
import tn.esprit.gestionzoo.exeptions.InvalidAgeException;
public class Zoo {
    public Animal[] animals = new Animal[25];//initialisation et declaration
    private Aquatic[] aquaticAnimals; //declaration de tableau

    private  int nbr_aquatic;

    private String family;
    private String name;
    private String city;
    final int NBR_CAGES = 3; //avec final constante ne change pas
    private int NbrAnimal = 0;
    public static int nbrAnimals = 0;
    Zoo() {
        animals = new Animal[NBR_CAGES];
    }
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        aquaticAnimals = new Aquatic[10];



    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Le nom ne doit pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimal() {
        return NbrAnimal;
    }
    public int getNbr_aquatic(){return nbr_aquatic;}

    public void setNbrAnimal(int nbrAnimal) {
        NbrAnimal = nbrAnimal;
    }
    public Aquatic[] getAquaticAnimals()
    {
        return this.aquaticAnimals;
    }





    void displayZoo() {
        System.out.println("My tn.esprit.gestionzoo.entities.Zoo :");
        System.out.println("name :" + name + ",city :" + city + ",n° cages:" + NBR_CAGES);
    }

    public String toString() {
        return "name :" + name + ",city :" + city + ",n° cages:" + NBR_CAGES;
    }


    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
//        if (searchAnimal(animal) != -1)
//            return false;
        if (!isZooFull()) {
            if (animal.getAge() < 0) {
                animals[NbrAnimal] = animal;
                NbrAnimal++;
            }
            throw new InvalidAgeException("l'animal ne peut pas avoir un age négatif");
        } else {
            throw new ZooFullException("Zoo full");
        }
    }


    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < NbrAnimal; i++) {
            animals[i] = animals[i + 1];
        }
        animals[NbrAnimal] = null;
        NbrAnimal--;
        return true;
    }

    void DisplayAnimals() {
        System.out.println("my zoo :" + name + "has");
        for (int i = 0; i < NbrAnimal; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < NbrAnimal; i++) {
            if (animals[i].getName() == animal.getName()) {
                return i;
            } else
                return index;
        }

        return index;
    }

    // prosit 3 inst 15
    public boolean isZooFull() {
        //return !(animals[animals.length-1]==null); //elle commence de 0
        return NbrAnimal == NBR_CAGES;
    }

    // inst 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.NbrAnimal > z2.NbrAnimal) {
            return z1;
        } else if (z2.NbrAnimal > z1.NbrAnimal)
            return z2;
        else {
            System.out.println("le nombre des animaux dans les deux zoo egaux");
            return z2;
        }
    }
    public boolean addAquaticAnimal(Aquatic aquatic) {

        if (nbr_aquatic < 10) {
            aquaticAnimals[nbr_aquatic] = aquatic;//a chaque fois ajouter un  animal a animals
            nbr_aquatic++;
            return true;
        } else
            return false;
    }
   
//inst29
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;//f parceque maxDepth de type float

        for (int i=0 ;i< nbr_aquatic ; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin)
            { //case bdha penguin wala classe mere matah
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }
    //inst30
    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for (int i=0;i<nbr_aquatic;i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                numberOfDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                numberOfPenguins++;
            }
        }

        System.out.println("Nombre des dauphins : " + numberOfDolphins);
        System.out.println("Nombre des pingouins : " + numberOfPenguins);
    }
}
