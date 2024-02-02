class Chess {
    private int item;
    public void setItem(int item){
        this.item=item;
    }
    public void getFrame(Save save){
        item=save.getItem();
    }
    public Save save(){
        return new Save(item);
    }
    public void print(){
        System.out.println(item);
    }
}