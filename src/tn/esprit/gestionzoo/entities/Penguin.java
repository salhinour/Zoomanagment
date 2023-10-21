package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public float getSwimmingDepth()
    {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");

    }

    public void setSwimmingDepth(float swimmingDepth)
    {
      this.swimmingDepth=swimmingDepth;
    }
    public Penguin() {
        super();
    }

    public Penguin(String family ,String name ,int age , boolean isMammal,String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat); //comme si j'ai fait un constructeur par defaut pour la classe mere
        this.swimmingDepth=swimmingDepth;
    }

}

