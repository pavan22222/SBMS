import java.util.Date;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vrnda.beans.Employee;
import com.vrnda.controller.EmployeeController;

public class ClientTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/vrnda/cfgs/applicationContext.xml");
		EmployeeController controller=ctx.getBean("employeeController", EmployeeController.class);
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name");
		emp.setName(scn.nextLine());
		System.out.println("Enter Age");
		emp.setAge(Integer.parseInt(scn.nextLine()));
		System.out.println("Enter Salary");
		emp.setSalary(Float.parseFloat(scn.nextLine()));
		emp.setDoj(new Date());
		System.out.println(controller.insertEmployee(emp));
	}
}
