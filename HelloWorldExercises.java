public class HelloWorldExercises {
    //1. imprime un mensaje que diga tu nombre en lugar de "Hola, Mundo!"
    public static void main(String[] args) {
        System.out.println("My name is Drako!");

        // 2. Imprime dos lineas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        //3. Añade un comentario sobre lo que hace cada línea del programa
        //Esta linea indica que se imprima un mensaje sobre la materia
        System.out.println("Diseño de software");

        //4. Crea un comentario en varías lineas.
        /* Este es un comentario
        que se realizo en varias 
        lineas de lo que estamos aprendiendo */

        //5. Imprime tu edad, tu color favorito y tu ciudad-
        System.out.println("Edad: 20 años");
        System.out.println("Color favorito: Azul");
        System.out.println("Ciudad: Pasto, Colombia");

        //6. Explrora los diferentes System.XXXprintln(); mas alla de "out"
        System.err.println("Este es un mensaje de error");
        System.out.println("Este es un mensaje de salida");
        System.out.printf("Este es un mensaje formateado: %s", "Hola Mundo");
        System.out.format("Este es otro mensaje formateado: %d", 123);
    
        System.out.printf("Este es un mensaje con formato de fecha: %tF", new java.util.Date());

        //7. Utiliza varios println para imprimir una frase
        System.out.println("Esta es una frase");
        
        System.out.println("que se imprime en varias");
        
        System.out.println("lineas utilizando varios println");

        //8. Imprime un diseño ASCII ( por ejemplo, una cara feliz usando simbolos)
        System.out.println("   -_-  ");

        //9. Intenta ejecutar el programa sin el metodo main y observa el error

        //10.Intenta cambiar el nombre del arhivo a uno diferente del de la clase y compila el programa.







        



    }
}
