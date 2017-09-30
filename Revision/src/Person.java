import java.util.Objects;

/**
 * Created by Sami on 10/06/2017.
 */
public class Person {

    private String nom;
    private String prenom;
    private Integer age;
    private String Cin;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nom, person.nom) &&
                Objects.equals(prenom, person.prenom) &&
                Objects.equals(age, person.age) &&
                Objects.equals(Cin, person.Cin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
