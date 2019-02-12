public class Person {

    private Education education;

    public Person(){
        this.education = new Education();
        education.setSchools();
    }

    public String toString(){
        return education.toString();
    }
}
