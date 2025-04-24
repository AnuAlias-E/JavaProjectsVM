package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.db.StudentDAO;
import com.training.service.StudentService;
import com.training.ui.StudentManagementController;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context;
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDAO dao= (StudentDAO) context.getBean("studentDAO");
        System.out.println(dao);
        
        StudentService service = (StudentService) context.getBean("studentService");
        System.out.println(service);
        
        StudentManagementController controller = (StudentManagementController)context.getBean("studentManagementController");
        System.out.println(controller);
    }
}
