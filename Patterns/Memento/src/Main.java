class Main {
    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.setItem(12);
        chess.print();
        Frame frame = new Frame();
        frame.setSave(chess.save());
        chess.setItem(14);
        chess.print();
        chess.getFrame(frame.getSave());
        chess.print();
    }
}