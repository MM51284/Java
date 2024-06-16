package Uebungen._600_ABC;

public class ABCMain {

    public static void main(String[] args) {
        // Aufgabe 1
        System.out.println("Aufgabe 1:");
        // Anlegen der Objekte der jeweiligen Klasse (A, B, C)
        A a = new A();
        B b = new B();
        C c = new C();

        // Aufrufen der Methoden der jeweiligen Klasse
        a.a();
        b.b();
        c.c();
        System.out.println("-----------");

        // Aufgabe 2
        System.out.println("Aufgabe 2:");
        // Anlegen eines neuen Objektes der Klasse C

        // Aufrufen der Methode c(), sowie der geerbten Methoden der Superklassen B und A
        c.a();
        c.b();
        c.c();
//        b.a();
//        b.b();
    }
}
