package com.java.web.service;

import java.util.List;

import com.java.web.model.Teacher;

public interface TeacherService {

	public void addTeacher(Teacher teacher);

    public void updateTeacher(Teacher teacher);

    public void removeTeacher(int id);

    public List<Teacher> getAllTeachers();
    
    public Teacher getTeacherByName(String name);
    
    public Teacher getTeacherById(int id);
}
