public class Human {
    String name;
    String surname;
    int age;
    public void print(){
        System.out.println(name+" "+surname+" "+age);
    }
}
interface HumanBuilder{
    HumanBuilder setName(String name);
    HumanBuilder setSurname(String surname);
    HumanBuilder setAge(int age);
    Human build();
}
class HumanBuild implements HumanBuilder{
    Human human=new Human();
    @Override
    public HumanBuilder setName(String name) {
        human.name=name;
        return this;
    }

    @Override
    public HumanBuilder setSurname(String surname) {
        human.surname=surname;
        return this;
    }

    @Override
    public HumanBuilder setAge(int age) {
        human.age=age;
        return this;
    }

    @Override
    public Human build() {
        return human;
    }
}