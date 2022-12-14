public class Portofolio extends Person{
    public String major;
    public String projectsHistory;

    public Portofolio (Integer id, String name, String gender, String address,
                    int age, String major, String projectsHistory) {
        super(id, name, gender, address, age);
        this.major = major;
        this.projectsHistory = projectsHistory;
    }
}
