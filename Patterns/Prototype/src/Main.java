class Main{
    public static void main(String[]args){
    People human = new People();
    human.age=22;
    human.name="Name";
    People human1 = new People();
    human1.age=33;
    human1.name="NameName";
    //People human2 = human.prototype(human);
    People human2 = human1.prototype();
    System.out.println(human2.age);
    System.out.println(human2.name);
    }
}
