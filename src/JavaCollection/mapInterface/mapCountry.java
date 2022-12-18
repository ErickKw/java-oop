package JavaCollection.mapInterface;
import JavaCollection.model.Person;

import java.util.Map;
public class mapCountry {
    private int idCountry;
    private String codeCountry;
    private String countryName;

    public mapCountry(int idCountry, String codeCountry, String countryName) {
        this.idCountry = idCountry;
        this.codeCountry = codeCountry;
        this.countryName = countryName;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "mapCountry{" +
                "idCountry=" + idCountry +
                ", codeCountry='" + codeCountry + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
