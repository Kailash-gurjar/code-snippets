package com.iocsnippet.daoImpl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iocsnippet.dao.EmployeeDao;
import com.iocsnippet.model.Employee;
 
@Repository("employeeDao")
public class EmployeeDaoImpl  implements EmployeeDao{
	@Autowired
    private SessionFactory sessionFactory;
	
    public void saveEmployee(Employee employee) {
    	sessionFactory.getCurrentSession().save(employee);
       // persist(employee);
    }
 
    public List<Employee> findAllEmployees() {
		
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
        return (List<Employee>) criteria.list();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
		/*
		 * Query query =
		 * getSession().createSQLQuery("delete from Employee where ssn = :ssn");
		 * query.setString("ssn", ssn); query.executeUpdate();
		 */
    }
 
     
    public Employee findBySsn(String ssn){
		return null;
		
    }
     
    public void updateEmployee(Employee employee){
        
    }
    
}
