public class Study extends Person{
    public String major;
    public String studyName;
    public String semester;
    public Study(Integer id, String name, String gender, String address, int age,
                 String major, String studyName, String semester) {
        super(id, name, gender, address, age);
        this.major = major;
        this.studyName = studyName;
        this.semester = semester;
    }
}
