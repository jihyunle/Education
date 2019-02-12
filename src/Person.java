public class Person {

    private Education education;

    public Person(){
        this.education = new Education();
        education.setSchools();
    }

    @Override
    public String toString(){
        return education.toString();
    }
}
