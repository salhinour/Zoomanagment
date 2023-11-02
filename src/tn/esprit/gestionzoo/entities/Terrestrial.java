package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public final class Terrestrial extends  Animal implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs()
    {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs)
    {
        this.nbrLegs=nbrLegs;
    }
    public Terrestrial()
    {}
    public  Terrestrial(String family ,String name ,int age , boolean isMammal,int nbrLegs)
    {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    @Override
    public void eatMeat(Food meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }


    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("The Terrestrial " + getName() + " is eating " + food + " plants and meat");

    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("The Terrestrial " + getName() + " is eating " + plant);

    }
}
