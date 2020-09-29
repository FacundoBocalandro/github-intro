public class NegativeAmountException extends UnsupportedOperationException{
    public NegativeAmountException(){
        super("Trying to recharge negative money!");
    }
}
