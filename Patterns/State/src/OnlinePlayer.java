class OnlinePlayer{
    Player player;
    void setPlay(Player player){
        this.player=player;
    }
    void setMusic(){
        if (player instanceof Music1){
            setPlay(new Music2());
        }
        else if (player instanceof Music2){
            setPlay(new Music3());
        }
        else if (player instanceof Music3){
            setPlay(new Music4());
        }
        else if (player instanceof Music4){
            setPlay(new Music1());
        }
    }
    void play(){
        player.play();
    }
}