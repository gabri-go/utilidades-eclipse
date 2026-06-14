package Ejemplos;

public class Main
{

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 20, "ana@mail.com");
        Persona p2 = new Persona("Paula", 20, "ana@mail.com");

        System.out.println(p1.toString());
        System.out.println("¿Son iguales? " + p1.equals(p2));

    }

}
