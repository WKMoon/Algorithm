public class Student {

    Student(String name, int kor, int math, int eng) {
        System.out.println("Constructor is created");
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }//end student

    Student(String name){
        this(name, 0, 0 ,0);
    }

//    Student(String name){
//        this.name = name;
//        this.kor = 0;
//        this.math = 0;
//        this.eng = 0;
//    }
    private String name;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int kor;
    private int eng;

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    private int math;



    public void setInfo(String name, int kor, int math, int eng){
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }//end setInfo

    public void print(){
        System.out.println(this.name);
        System.out.println("Korean:"+this.kor);
        System.out.println("English:"+this.eng);
        System.out.println("Math:"+this.math);
        System.out.println("Total: "+(math+eng+kor));
        System.out.println("Average: "+(math+eng+kor)/3);
    }//end print

}
