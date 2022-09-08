
public class SentenciaIF {
    public static void main(String[] args) {
        
        var numeroIf = -1;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        String estacion = "Primavera";
        

        if(numeroIf >= 0)
        {
            System.out.println("El numero es positivo.\n");
        }
        else if(numeroIf ==0)
        {
            System.out.println("El numero es 0.\n");
        }
        else
        {
            System.out.println("El numero es Negativo.\n");
        }
        
        //--------------------------------------------------------------
        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println("Resultado While "+numeroWhile);
        }

        //--------------------------------------------------------------
        do{
            numeroDoWhile++;
        }while(numeroDoWhile<3);

        System.out.println("\nResultado DoWhile "+numeroDoWhile+"\n");

        //--------------------------------------------------------------

        for(int numeroFor = 0; numeroFor<=3; numeroFor++)
        {
            int resultado = numeroFor;
            System.out.println("El resultado del FOR es "+resultado);
        }

        //--------------------------------------------------------------

        switch(estacion)
        {
            case "Verano":
            System.out.println("\nEstamos en verano");
            break;
            case "Otoño":
            System.out.println("\nEstamos en Otoño");
            break;
            case "Primavera":
            System.out.println("\nEstamos en Primavera");
            break;
            case "Invierno":
            System.out.println("\nEstamos en Invierno");
            break;
            default:
            System.out.println("\nEl valor introducido no es una estación del año");
    
        }
        
    }    
}


