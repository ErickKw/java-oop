package JavaCollection.iterableCollection;

public class DetailPerson {

    private int detail_person_id;
    private String first_name;
    private String last_name;
    private int mobile_phone;

    public DetailPerson(int detail_person_id, String first_name, String last_name, int mobile_phone) {
        this.detail_person_id = detail_person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile_phone = mobile_phone;
    }

    public int getDetail_person_id() {
        return detail_person_id;
    }

    public void setDetail_person_id(int detail_person_id) {
        this.detail_person_id = detail_person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(int mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    @Override
    public String toString() {
        return "DetailPerson{" +
                "detail_person_id=" + detail_person_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", mobile_phone=" + mobile_phone +
                '}';
    }
}
