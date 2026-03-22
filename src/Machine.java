public class Machine {

    void addWater() throws Exception{
        Thread.sleep(1000);
        System.out.println("adding water");

    }

    void addSugar() throws Exception{
        Thread.sleep(1000);
        System.out.println("adding Sugar");


    }

}

class Tea extends Machine{
    void makeTea() throws Exception {
        Thread.sleep(1000);
        System.out.println("adding powder");
        addWater();
        addSugar();
        Thread.sleep(1000);
        System.out.println("Tea Ready");


    }


}

class Coffee extends Machine{

    void makeCoffee()throws Exception {
        Thread.sleep(2000);
        System.out.println("adding powder");
        addWater();
        addSugar();
        Thread.sleep(2000);
        System.out.println("Coffee Ready");


    }

}


