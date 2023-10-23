package ExceptionPersonalise;

public class Personne {
    private  String nom;
    private  int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  throws AgeNegatifException{
       if(age>0)
        this.age = age;
       else
           throw new AgeNegatifException("l'age est négatif");
    }
}
