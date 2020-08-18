public class Launcher2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println();

        Computer com = new Computer("moon", 20,"company", "2020-10-20", "Windows");
        System.out.println(com.toString());
        com.print();
        System.out.println();

        Monitor mo = new Monitor("moon", 20,"company", "2020-10-20", 30);
        mo.print();
        System.out.println(mo.toString());
        System.out.println();

        SmartPhone sp = new SmartPhone("moon", 20,"company", "2020-10-20", "01081915743");
        sp.print();
        sp.call();
        System.out.println(sp.toString());

    }
}
