package by.rdbce.domain;

/**
 * Created by malabar on 3/26/17.
 */
import  javax.persistence.*;

@Entity
@Table (name = "tickets")
public class tickets {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private int ID;

    @Column(name = "name")
    private String NAME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

}

