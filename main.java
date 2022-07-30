public class main {
    public static void main(String[] args) {
       Course math = new Course("Math", "Math101", "MTH");
       Course physics = new Course("Physics", "PHY101", "PHY");
       Course chemist  = new Course("Chemist", "CHM101", "CHM");

       Teacher t1 = new Teacher("Timeless V1", "111" , "MTH");
       Teacher t2 = new Teacher("Timeless V2", "222" , "PHY");
       Teacher t3 = new Teacher("Timeless V3", "333" , "CHM");

       math.addTeacher(t1);
       physics.addTeacher(t2);
       chemist.addTeacher(t3);

       Student s1 = new Student("John Small", 4, "123", math, physics, chemist);
       s1.addBulkExamNote(50,20,40);
       s1.isPass();

       Student s2 = new Student("Arthur Lovato", 4, "456", math, physics, chemist);
       s2.addBulkExamNote(100, 50, 40);
       s2.isPass();

       Student s3 = new Student("Fin Johnson", 4, "789", math, physics, chemist);
       s3.addBulkExamNote(50, 20, 40ma);
       s3.isPass();
    }
}
