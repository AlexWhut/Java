package Exceptions.Throw2;

public class Test {
            
    public static boolean intEdadTrabajo(int e) throws Exception{
        boolean r = false;
        if (e < 18  || e > 60){
            throw new Exception("edad prohibida");
        }else{
            r = true;
        } return r;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            intEdadTrabajo(65);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

       try{
        dividir(5, 0);
       } catch (Exception e){
        System.out.println(e.getMessage());
       }
    }


}
