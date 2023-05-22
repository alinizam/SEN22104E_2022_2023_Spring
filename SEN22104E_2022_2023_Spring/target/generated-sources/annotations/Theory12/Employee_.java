package Theory12;

 
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

 
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> firstName;
    public static volatile SingularAttribute<Employee, String> lastName;
    public static volatile SingularAttribute<Employee, Integer> jobId;
    public static volatile SingularAttribute<Employee, Integer> employeeId;
    public static volatile SingularAttribute<Employee, Integer> salary;

}