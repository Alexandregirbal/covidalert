package polytech.covidalert.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name="covid")
@Access(AccessType.FIELD)
public class Covid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long covid_id;
    private String forme;
    private String detail;
    // Liste des covids positifs
    @OneToMany(mappedBy = "covid")
    private List<HaveCovid> listCovided;

    public Covid(long covid_id, String forme, String detail, List<HaveCovid> listCovided) {
        this.covid_id = covid_id;
        this.forme = forme;
        this.detail = detail;
        this.listCovided = listCovided;
    }

    public long getCovid_id() {
        return covid_id;
    }

    public void setCovid_id(long covid_id) {
        this.covid_id = covid_id;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }



}
