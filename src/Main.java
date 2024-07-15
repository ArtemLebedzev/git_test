public class Main {
    public static void main(String[] args) {
        Student person0 = new Student("Anton", 19, 112222);
        Person person1 = new Student("Artem", 20, 112233);
        Info info = new Student("Avgust", 22, 112244);

        System.out.println(person0.toString());
        System.out.println(person1.toString());
        System.out.println(info.toString());

        person0.showInfo();
        person1.showInfo();
        info.showInfo();

        showInfoByMethod(info);
        showInfoByMethod(person0);
    }

    public static void showInfoByMethod(Info info){
        System.out.print("By method: ");
        info.showInfo();
    }
}

