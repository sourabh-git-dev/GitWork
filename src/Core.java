public class Core {

    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Core {
    static void show() {
        System.out.println("Child static method");
    }
}


