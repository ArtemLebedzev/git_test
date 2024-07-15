public abstract class Person implements Info{
    protected String name;
    protected int age;
    private static int countPeople;
    public static final int CONSTANT = 0;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public abstract String toString();

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

    public static int getCountPeople(){
        return countPeople;
    }

}