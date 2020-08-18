public class Computer extends Product{
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    private String osName;

    Computer(){
        System.out.println("Computer constructor is called");
    }


    Computer(String osName){
        this.osName = osName;
    }

    Computer(String pname, int price, String company, String date, String osName){
        super(pname, price, company, date);
        this.osName = osName;
    }


    public void print(){
        System.out.println("Computer print() is called");
    }

    public String toString(){
        return super.toString() + "\nos: "+osName;

    }
}
