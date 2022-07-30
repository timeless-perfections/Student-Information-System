public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemist;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physics,Course chemist) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemist = chemist;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemist) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemist >= 0 && chemist <= 100) {
            this.chemist.note = chemist;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemist.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed the class. ");
            } else {
                System.out.println("Failed in class. ");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note + this.chemist.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Notes : " + this.math.note);
        System.out.println("Physcis Notes : " + this.physics.note);
        System.out.println("Chemist Notes : " + this.chemist.note);
    }

}