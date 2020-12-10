public class Number {
    private int firstNumber;
    private int secondNumber;

    public Number(){
    }

    public Number(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int sum(){
        return getFirstNumber() / getSecondNumber();
    }

    public void divide(){
        int divide1;
        divide1 = firstNumber / secondNumber;
    }
}
