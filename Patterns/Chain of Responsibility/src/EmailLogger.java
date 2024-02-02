class EmailLogger extends Logger{

    public EmailLogger(int priority){
        super(priority);
    }
    Logger next;
    public void setNext(Logger next){
        this.next=next;
    }

    public void write(String message){
        System.out.println("Email"+message);
    }
}