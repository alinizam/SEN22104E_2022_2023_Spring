/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory12Lab;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ali.nizam
 */
@Entity
@Table(name = "PATIENS")
@NamedQueries({
    @NamedQuery(name = "Patiens.findAll", query = "SELECT p FROM Patiens p"),
    @NamedQuery(name = "Patiens.findByPatientid", query = "SELECT p FROM Patiens p WHERE p.patientid = :patientid"),
    @NamedQuery(name = "Patiens.findByFirstName", query = "SELECT p FROM Patiens p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Patiens.findByLastName", query = "SELECT p FROM Patiens p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Patiens.findByDoctorId", query = "SELECT p FROM Patiens p WHERE p.doctorId = :doctorId")})
public class Patiens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PATIENTID")
    private Integer patientid;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "DOCTOR_ID")
    private int doctorId;

    public Patiens() {
    }

    public Patiens(Integer patientid) {
        this.patientid = patientid;
    }

    public Patiens(Integer patientid, int doctorId) {
        this.patientid = patientid;
        this.doctorId = doctorId;
    }

    public Patiens(Integer patientid, String firstName, String lastName, int doctorId) {
        this.patientid = patientid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctorId = doctorId;
    }
    

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientid != null ? patientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patiens)) {
            return false;
        }
        Patiens other = (Patiens) object;
        if ((this.patientid == null && other.patientid != null) || (this.patientid != null && !this.patientid.equals(other.patientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Theory12Lab.Patiens[ patientid=" + patientid + " ]";
    }
    
}
