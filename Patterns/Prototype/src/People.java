public class People {
    String name;
    int age;
    /*public  People prototype(People elprototype){
        return elprototype;
    }*/
    public  People prototype(){
        People elprototype = new People();
        elprototype.name = name;
        elprototype.age = age;
        return elprototype;
    }
}
