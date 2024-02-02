class Main{
    public static void main(String[] args) {
        SMSLogger smsLogger = new SMSLogger(Level.ERROR);
        FileLogger fileLogger = new FileLogger(Level.DEBUG);
        EmailLogger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);
        smsLogger.writeMessage(" 1",Level.ERROR);
        smsLogger.writeMessage(" 123",Level.INFO);
        smsLogger.writeMessage(" 312",Level.ERROR);
        smsLogger.writeMessage(" 444",Level.DEBUG);
    }
}





