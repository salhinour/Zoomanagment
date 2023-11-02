package tn.esprit.gestionzoo.entities;
//toutes les sous-classes doivent être déclarés avec non-sealed pour permettre l'héritage d'autres classes sans la permission

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public   non-sealed abstract class Aquatic extends Animal implements Carnivore<Food> {
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
//inst 28 obligatoire  et avec abstract jje doit supprimer tous le code
  //avec abstract on peut pas faires des instances
    public abstract void swim() ;
    public boolean equals(Object obj) {
        if (obj==null)  //est ce que mon objet est nul ou pas
            return false;


        if (obj==this) //est ce que l'objet en parmatere est touvee ou pas
            return true;
        if(obj instanceof Aquatic aquatic)
        {
            return aquatic.getName().equals(super.getName()) && aquatic.getAge()==super.getAge() && aquatic.habitat.equals(this.habitat);//nom vient de classe mere "super"
        }
        return false;
    }
}
