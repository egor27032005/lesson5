package service;

import module.Student;
import module.StudyGroup;
import module.Teacher;
import module.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    private static List<StudyGroup> studyGroup;
    public static void GroupFormation(Teacher teacher, List<Student> student){
        studyGroup.add(teacher);
        studyGroup.add(student);

    }

}
