package service;

import module.Student;
import module.Teacher;
import module.Type;
import module.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public void create(String lastName, String firstName, String secondName, Type type) {
        int id = getFreeId(type);
        if(Type.STUDENT==type){
            Student student = new Student(lastName, firstName, secondName, id);
            userList.add(student);
        }
        if(Type.TEACHER==type){
            Teacher teacher = new Teacher(lastName, firstName, secondName,id);
            userList.add(teacher);
        }

    }
    public User getUserID(Type type, int id){
        User resultuser= null;
        boolean itaStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itaStudent && user instanceof Student && ((Student) user ).getStudentID()==id) {
               resultuser=user;

            }
            if (itaStudent && user instanceof Teacher && ((Teacher) user).getTeacherID()==id) {
                resultuser=user;
            }

        }
        return resultuser;
    }
    public List<User> getAllUser(){
        return userList;
    }
    public List<User> getStudentAll(){
        List<User> resultList=new ArrayList<User>();
        for( User user: userList){
            if(user instanceof Student){
                resultList.add(user);
            }
        }
        return resultList;
    }

    private int getFreeId(Type type) {
        int lastID = 1;
        boolean itaStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (itaStudent && user instanceof Student) {
                lastID = ((Student) user).getStudentID() + 1;

            }
            if (itaStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getTeacherID() + 1;
            }

        }
        return lastID;

    }
}
