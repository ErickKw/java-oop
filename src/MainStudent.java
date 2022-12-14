public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Siti","Wannita",
                "Yogyakarta",20,"Teknik Informatika",12345);

        System.out.println("Data Student:");
        System.out.println("Address:" + student1.address + "\nName:"
                + student1.name + "\nGender:" + student1.gender +
                "\nStudy Program:" + student1.major + "\nStudentId :" + student1.studentId + "\t\t");
        System.out.println("=============");


        Study Study1 = new Study(1, "Erick", "Boy", "Surabaya",
                20, "Sistem Informasi", "Java OOP", "3rd Semester");
        System.out.println("Hello, I'am "+ Study1.name +
                " i'am learning "+ Study1.studyName +
                " and " + Study1.semester);

        Portofolio portofolio = new Portofolio(1, "Denjaka", "Girls",
                "Jakarta", 23, "Management", "Point Of sales");
        System.out.println(portofolio.projectsHistory);
    }

}
