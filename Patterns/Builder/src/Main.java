    public class Main {
    public static void main(String[] args) {
        Human a = new HumanBuild().setName("name").setAge(12).setSurname("surname").build();
        a.print();
    }
}