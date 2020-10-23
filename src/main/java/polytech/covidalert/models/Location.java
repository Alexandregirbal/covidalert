package polytech.covidalert.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name="locations")
@Access(AccessType.FIELD)
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long location_id ;
    public long getLocation_id() {
        return location_id;
    }
    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    @ManyToMany(mappedBy = "locations")
    @JsonIgnore
    private List<User> users;
}






