package polymophism;

public class Manager extends Employe {
    Manager(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("Hello Manager " + this.name);
    }
}
