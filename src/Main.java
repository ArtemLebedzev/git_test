public class Main {
    public static void main(String[] args) {
        
    }
}

class Class1{
    private String name;
    private int age;
    private static int countPeople;
    public static final int CONSTANT = 0;

    {
        name = "Default";
        age = 0;
    }

    public Class1() {
        countPeople++;
    }

    public Class1(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void setCountPeople(int countPeople){
        Class1.countPeople = countPeople;
    }

    public static int getCountPeople(){
        return countPeople;
    }

    void toDisplay(){
        System.out.println(name + " " + age);
    }
}