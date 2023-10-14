package tn.esprit.gestionzoo.entities;

 public non-sealed class Terrestrial extends  Animal {
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
}
