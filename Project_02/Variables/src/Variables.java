public class Variables {
    public static void main(String[] args) 
    {
        int numero1 = 10;
        double numero2;
        numero2 = 3.14; // D o d al final para que sea un double
        float numero3;
        numero3 = 3.14159F; // F o f para que no se confunda en que sea un Double, y lo tome como un float
        char caracter1 = 'A', caracter2=65;
        boolean opcion = true;
        long numero4;
        numero4 = 987654321L; // L o l para que lo tome como un long
        byte numero5 = 126;
        short numero6 = 128;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);

        // Variables de referencia

        String mensaje, mensaje2;
        mensaje = "Esto es un mensaje";
        mensaje2 = """
                Este
                es
                un mensaje
                multilinea
                """;
            System.out.println(mensaje);
            System.out.println(mensaje2);
            System.out.println(mensaje+' '+numero1);
            System.out.println(mensaje.toUpperCase());
            String numero1_string=Integer.toString(numero1);
            System.out.println(mensaje.concat(numero1_string));

            // Variable general

            var variable1 = 15;
            var variable2 = 'F';
            var variable3 = 2.8754F;

            // Constante
            final var PI = 3.14159;
            // PI=3.1416; No funciona

            System.out.println(variable1);
            System.out.println(variable2);
            System.out.println(variable3);
            System.out.println(PI);
    }
}
