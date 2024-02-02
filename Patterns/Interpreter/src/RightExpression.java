class RightExpression implements Expression{
    Expression left;
    Expression right;
    public RightExpression(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }
    @Override
    public int interpret() {
        return left.interpret()+right.interpret();
    }
}