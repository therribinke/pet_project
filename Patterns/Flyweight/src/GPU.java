class GPU implements Frequency{
    @Override
    public void change(int MHz,int time) {
        System.out.println(MHz+" "+time+" Видеоядро");
    }
}