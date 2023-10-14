package tn.esprit.gestionzoo.entities;
//extends ca veut dire que la classe dolphin herite de la classe aquatic
public class Dolphin extends Aquatic{
    protected float swimmingSpeed;


    public float getSwimmingSpeed()
    {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void setSwimmingSpeed(float swimmingSpeed)
    {
        this.swimmingSpeed=swimmingSpeed;
    }
    public Dolphin() {
        super(); //comme si j'ai fait un constructeur par defaut pour la classe mere
    }

    public Dolphin(String habitat,float swimmingSpeed,String family ,String name ,int age , boolean isMammal) {
        super(family, name, age, isMammal, habitat); //comme si j'ai fait un constructeur par defaut pour la classe mere
       this.swimmingSpeed=swimmingSpeed;
    }
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

}
