interface photo {
    void shoot();
}
class camera implements photo{
    @Override
    public void shoot(){
        System.out.println("Фотография на камеру");
    };
}
class photocamera implements photo{
    @Override
    public void shoot(){
        System.out.println("Фотография на фотоаппарат");
    };
}
interface manufacturer{
    void createtech(photo face);
}
class sony implements manufacturer{
    @Override
    public void createtech(photo face){
        System.out.println("Создатель Sony");
        face.shoot();
    };
}
class nikon implements manufacturer{
    @Override
    public void createtech(photo face){
        System.out.println("Создатель Sony");
        face.shoot();
    };
}
interface factory {
    photo shootphoto();
    manufacturer name();
}
class nikonfactory implements factory{
    @Override
    public photo shootphoto(){
        return new photocamera();
    }
    @Override
    public manufacturer name(){
        return new nikon();
    }
}
class sonyfactory implements factory{
    @Override
    public photo shootphoto(){
        return new camera();
    }
    @Override
    public manufacturer name(){
        return new sony();
    }
}

class Main {
    public static void main(String[] args) {
        factory one = new nikonfactory();
        photo hair = one.shootphoto();
        manufacturer firma = one.name();
        firma.createtech(hair);
        factory two = new sonyfactory();
        photo eyes = two.shootphoto();
        manufacturer firma1 = one.name();
        firma1.createtech(eyes);
    }
}