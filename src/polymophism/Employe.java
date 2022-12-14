package polymophism;

public class Employe {
    String name;

    Employe(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello Employee " + this.name);
    }
}
