public class Product {
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String pname;
    private int price;
    private String company;
    private String date;

    Product(){
        System.out.println("Product constructor is called");
    }

    public String toString(){
        return "Product: " + pname + "\nPrice: " + price + "\ncompany: "+company+ "\ndate: " +date;
    }

    public void print(){
        System.out.println("Product print() is called");
    }

    Product(String pname, int price, String company, String date){
        this.pname = pname;
        this.company = company;
        this.price = price;
        this.date = date;
    }

}//end class
