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
    private int NAME;

    @Column(name = "status")
    private int STATUS;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNAME() {
        return NAME;
    }

    public void setNAME(int NAME) {
        this.NAME = NAME;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }
}

