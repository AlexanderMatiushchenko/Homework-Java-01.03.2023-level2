public class Calc {
    public static void main(String [] args){
        add();
        subtract();
        divide();
        multiply();

    }
    public static void add(){
        int number1 = 10;
                int number2 = 20;
                        int resultOfAdd = number1 + number2;
                                System.out.println(resultOfAdd);
    }
    public static void subtract(){
        int number1 = 20;
                int number2 = 11;
                        int resultOfSubtract = number1 - number2;
                        System.out.println(resultOfSubtract);
    }
    public static void divide (){
        double number1 = 20;
                double number2 = 15;
                        double resultOfDivide = number1 / number2;
        System.out.println(resultOfDivide);
    }
    public static void multiply(){
        int number1 = 50;
        int number2 = 3;
        int resultOfMultiply = number1 * number2;
        System.out.println(resultOfMultiply);
    }
}
