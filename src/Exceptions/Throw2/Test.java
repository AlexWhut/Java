package Exceptions.Throw2;

public class Test {
    public static void main(String[] args) {
        try {
            Metodos.intEdadTrabajo(65);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

       try{
        Metodos.dividir(5, 0);
       } catch (Exception e){
        System.out.println(e.getMessage());
       }
    }


}
