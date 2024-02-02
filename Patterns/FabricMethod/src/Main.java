interface idea {
    void think();
}
class man implements idea{
    @Override
    public void think(){
        System.out.println("Мужчина придуман");
    }
}
class woman implements idea{
    @Override
    public void think(){
        System.out.println("Женщина придумана");
    }
}
interface god{
    idea create();
}
class mancreate implements god{
    @Override
    public idea create(){
        return new man();
    }
}
class womancreate implements god{
    @Override
    public idea create(){
        return new woman();
    }
}
class Main{
    public static void main(String[] args) {
        god human = new mancreate();
        idea one = human.create();
        human = new womancreate();
        idea two = human.create();
        one.think();
        two.think();

    }
}