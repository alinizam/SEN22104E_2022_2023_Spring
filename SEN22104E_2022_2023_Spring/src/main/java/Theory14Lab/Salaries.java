/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Theory14Lab;

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
@Table(name = "SALARIES")
@NamedQueries({
    @NamedQuery(name = "Salaries.findAll", query = "SELECT s FROM Salaries s"),
    @NamedQuery(name = "Salaries.findBySalaryId", query = "SELECT s FROM Salaries s WHERE s.salaryId = :salaryId"),
    @NamedQuery(name = "Salaries.findByEmployeeId", query = "SELECT s FROM Salaries s WHERE s.employeeId = :employeeId"),
    @NamedQuery(name = "Salaries.findByMonthId", query = "SELECT s FROM Salaries s WHERE s.monthId = :monthId"),
    @NamedQuery(name = "Salaries.findBySalary", query = "SELECT s FROM Salaries s WHERE s.salary = :salary")})
public class Salaries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALARY_ID")
    private Integer salaryId;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_ID")
    private int employeeId;
    @Basic(optional = false)
    @Column(name = "MONTH_ID")
    private int monthId;
    @Basic(optional = false)
    @Column(name = "SALARY")
    private int salary;

    public Salaries() {
    }

    public Salaries(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public Salaries(Integer salaryId, int employeeId, int monthId, int salary) {
        this.salaryId = salaryId;
        this.employeeId = employeeId;
        this.monthId = monthId;
        this.salary = salary;
    }

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonthId() {
        return monthId;
    }

    public void setMonthId(int monthId) {
        this.monthId = monthId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaryId != null ? salaryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salaries)) {
            return false;
        }
        Salaries other = (Salaries) object;
        if ((this.salaryId == null && other.salaryId != null) || (this.salaryId != null && !this.salaryId.equals(other.salaryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Theory14.Salaries[ salaryId=" + salaryId + " ]";
    }
    
}
