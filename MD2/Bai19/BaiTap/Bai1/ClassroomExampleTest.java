package MD2.Bai19.BaiTap.Bai1;

public class ClassroomExampleTest {
    public static final String[] validClassroom = new String[] {"C0318G", "A6234M", "P7166N", "A0000H", "C1111I", "P5135K"};
    public static final String[] invalidClassroom = new String[] {"P0323A", "M0318G", "C03_8G", "C0318_G", "C03118G"};

    public static void main(String[] args) {
        ClassroomExample classroomExample = new ClassroomExample();
        for (String s : validClassroom) {
            if (classroomExample.validate(s)) {
                System.out.println(s + " is valid classroom");
            } else {
                System.out.println(s + " is invalid classroom");
            }
        }
        for (String s : invalidClassroom) {
            if (classroomExample.validate(s)) {
                System.out.println(s + " is valid classroom");
            } else {
                System.out.println(s + " is invalid classroom");
            }
        }
    }
}
