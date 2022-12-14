package polymophism;

public class MainPolymorphism {
    public static void main(String[] args) {

        Employe employe = new Employe("Umi");
        Manager manager = new Manager("Ahmad");
        VicePresident vicePresident = new VicePresident("Joko");

        // call method
        // employee.sayHello();
        // manager.sayHello();
        // vicePresident.sayHello();

        sayHello(vicePresident);
        sayHello(manager);
        sayHello(employe);
    }

    public static void sayHello(Employe employe) {
        if (employe instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employe;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employe instanceof Manager) {
            Manager manager = (Manager) employe;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employe.name);
        }
    }
}
