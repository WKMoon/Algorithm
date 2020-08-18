import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu = new Student("moon", 80, 20, 10);
        stu.print();

        System.out.println();
        Student stu1 = new Student("moon1");
        stu1.print();


//        System.out.println("몇명의 학생을 등록할까요?");
//        int memCnt = sc.nextInt();
//        Student[] student = new Student[memCnt];
//        for(int i=0; i<memCnt; i++){
//            student[i] = new Student();
//            System.out.println((i+1) + "번째 학생의 이름을 입력하세요.");
//            String name = sc.next();
//            student[i].setName(name);
//
//            System.out.println((i+1) + "번째 학생의 국어점수를 입력하세요.");
//            int kor = sc.nextInt();
//            student[i].setKor(kor);
//
//            System.out.println((i+1) + "번째 학생의 수학점수를 입력하세요.");
//            int math = sc.nextInt();
//            student[i].setMath(math);
//
//            System.out.println((i+1) + "번째 학생의 영어점수를 입력하세요.");
//            int eng = sc.nextInt();
//            student[i].setEng(eng);
//        }
//
//        for(Student std : student){
//            std.print();
//        }
    }
}
