package classw;

public class calc {

    public int divide(int a, int b){

        if(b==0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return a/b;
    }

    static void main() {
        calc calc = new calc();
        try{
            System.out.println(calc.divide(5,0));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
