import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String args[]) {

       /* int[] a = {1, 2, 5, 3, 4};
        abc(a);*/
//        quick();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("abc");
        student.setAge(12);
        Student student1 = new Student();
        student1.setAge(24);
        student1.setName("bcd");
        Student student2 = new Student();
        student2.setName("cde");
        student2.setAge(35);
        students.add(student1);
        students.add(student);
        students.add(student2);
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {

                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(students.toString());
    }

    private static void abc(int[] a) {

//        maopao(a);

    }

    private static void quick() {


    }

    private static void maopao(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int length = a.length - 1; length > 0; length--) {

                if (a[length] < a[length - 1]) {

                    int temp = a[length];
                    a[length] = a[length - 1];
                    a[length - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
