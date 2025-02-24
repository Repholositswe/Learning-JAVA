public class Studentarray {
   
    public static void main(String a[]) {
    
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Prudence";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Boledi";
        s2.marks = 68;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sihle";
        s3.marks = 78;

        Student students[] = new Student[3];
        students[0] =s1;
        students[1] =s2;
        students[2] = s3;
    }
    
}
