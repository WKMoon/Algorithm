public class Monitor extends Product {
    private int inch;


    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    Monitor(){
        System.out.println("Monitor constructor is called");
    }

    Monitor(String pname, int price, String company, String date, int inch){
//        super.setPname(pname);
//        super.setPrice(price);
//        super.setCompany(company);
//        super.setDate(date);
        super(pname, price, company, date);
        this.inch = inch;
    }

    public void screenOn(){
        System.out.println("Screen on");
    }

    public void print(){
        System.out.println("Monitor print() is called");
    }

    public String toString(){
        return super.toString() + "\ninch: "+inch;

    }




}
