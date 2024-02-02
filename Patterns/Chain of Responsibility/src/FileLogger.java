class FileLogger extends Logger{

    public FileLogger(int priority){
        super(priority);
    }
    Logger next;
    public void setNext(Logger next){
        this.next=next;
    }
    public void write(String message){
        System.out.println("File"+message);
    }
}