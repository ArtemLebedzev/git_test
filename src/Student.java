public class Student extends Person{
    protected int idCard;

    public Student(String name, int age, int idCard) {
        super(name, age);
        this.idCard = idCard;
    }

    public String toString(){
        return String.format(name + "," + age + "," + idCard);
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
}
