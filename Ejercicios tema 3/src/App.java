public class App {
    public static void main(String[] args) throws Exception {
        
        Coche miCoche = new Coche();

        miCoche.aumentaPuertas();
        miCoche.aumentaPuertas();
        miCoche.aumentaPuertas();
        miCoche.aumentaPuertas();
        System.out.println("Mi coche tiene "+miCoche.puertas+" puertas");



        int num1 = 5;
        int num2 = 15;
        int num3 = 20;

        int resultado = suma(num1, num2, num3);

        System.out.println("El resultado de la suma es "+resultado);
    }

    public static int suma(int a,int b,int c) {

        return a + b + c;
    }   

}


class Coche{
    
    int puertas = 0;

    public void aumentaPuertas()
    {
        this.puertas++;
    }
    

}