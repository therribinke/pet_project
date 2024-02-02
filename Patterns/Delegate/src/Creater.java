public class Creater {
    CarBrand carbrand;
    public void setCarBrand(CarBrand c){
        carbrand=c;
    }
    public void print() {
        carbrand.create();
    }
}
