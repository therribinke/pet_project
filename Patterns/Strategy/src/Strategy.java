class Strategy{
    Player player;
    public void  setStrategy(Player player){
        this.player=player;
    }
    public void getResult(){
        player.play();
    }
}