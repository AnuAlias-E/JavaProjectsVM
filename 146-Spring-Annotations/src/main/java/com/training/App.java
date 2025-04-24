package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.db.CustomerDAO;
import com.training.service.CustomerService;
import com.training.ui.CustomerManagementController;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context;
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO dao= (CustomerDAO) context.getBean("customerDAO");
        System.out.println(dao);
        
        CustomerService service = (CustomerService) context.getBean("customerService");
        System.out.println(service);
        
        CustomerManagementController controller = (CustomerManagementController)context.getBean("customerManagementController");
        System.out.println(controller);
    }
}
