package dao;

import database.DatabaseConnectionManager;
import domain.Employee;

import java.sql.SQLException;

public class EmployeeDAO {

    DatabaseConnectionManager connectionManager;

    public void saveEmployee(Employee employee) throws SQLException {
        // database.DatabaseConnectionManager connectionManager = database.DatabaseConnectionManager.getManagerInstance();
        // connectionManager.connect();
        // connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        // connectionManager.disconnect();
        System.out.println("saved employee to the database: " + employee);
    }

    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database: " + employee);

    }

}
