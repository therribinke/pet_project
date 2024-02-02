class ClassicUser implements User{
    Chat chat;
    ClassicUser (Chat chat){
        this.chat=chat;
    }
    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User get message"+"\""+message+"\"");
    }
}