package om.training.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.training.model.Employee;

public class Main10 {
	public static void main(String[] args) {
		// While using keyboard buffer no need to close all the streams
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		int id = 0;
		String name = null, gender = null, city = null;
		double basic = 0.0;
		try {
			System.out.println("Enter Employee ID :");
			String str = br.readLine();
			id = Integer.parseInt(str);

			System.out.println("Enter Employee Name :");
			name = br.readLine();

			System.out.println("Enter Employee Gender :");
			gender = br.readLine();
			System.out.println("Enter Employee City :");
			city = br.readLine();
			System.out.println("Enter Employee Basic Salary :");
			str = br.readLine();
			basic = Double.parseDouble(str);

		} catch (IOException e) {
			System.err.println("Some error while reading the input from the keyboard");
			System.exit(0);
		}

		Employee employee = new Employee(id, name, gender, city, basic);
		System.out.println("Employee Details");
		System.out.println(employee.toString());
		System.out.println("Net Salary:" + employee.getNetSalary());

	}
}
