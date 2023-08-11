package Controller;

import module.Student;
import module.Type;
import module.User;
import service.DataService;
import view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView view=new StudentView();
    public void createStudent(String lastName, String firstName, String secondName){
        dataService.create(lastName, secondName, firstName, Type.STUDENT);
    }
    public void getAllStudent(){
       List<User> userList=dataService.getStudentAll();
       for(User user:userList){
           StudentView.printConsole((Student) user);
       }

    }
}
