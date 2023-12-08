public class Human {
    private final String name;
    private final String surname;
    private final int age;

    public Human(String name,String surname,int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;

    }

    public void print(){
        System.out.println(name+" "+surname+" "+age);
    }

}

class HumanBuild {
    private String name;
    private String surname;
    private int age;
    public HumanBuild setName(String name){
        this.name=name;
        return this;
    }
    public HumanBuild setSurname(String surname){
        this.surname=surname;
        return this;
    }
    public HumanBuild setAge(int age){
        this.age=age;
        return this;
    }
public Human build(){
        return new Human(this.name,this.surname,this.age);
    }

}
