package tn.esprit.gestionzoo.entities;
//toutes les sous-classes doivent être déclarés avec non-sealed pour permettre l'héritage d'autres classes.
public non-sealed class Aquatic extends Animal {
    private String habitat;
    //INST 21

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic() {
        //super();      //tant que il y'a un const par defaut dans la classe mere on peut ne pas utiliser super dans la classe fille
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {   //on peut pas recuperer sans protected dans les attribut de la classe mere
        /*this.habitat = habitat;
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;*/
        super(family, name, age, isMammal);   //remplace les lignes precidente 14 13 12 11
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");

    }
}
