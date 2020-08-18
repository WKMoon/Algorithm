public class SmartPhone extends Product {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    SmartPhone(){
        System.out.println("SmartPhone constructor is called");
    }

    SmartPhone(String pname, int price, String company, String date, String phoneNumber){
        super(pname, price, company, date);
        this.phoneNumber = phoneNumber;
    }

    public void call(){
        System.out.println("calling to "+phoneNumber);
    }
    public void print(){
        System.out.println("SmartPhone print() is called");
    }

    public String toString(){
        return super.toString() + "\nPhoneNum: " + phoneNumber;
    }
}
