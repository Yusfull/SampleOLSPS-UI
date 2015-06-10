package com.java.web.service;

import java.util.List;

import com.java.web.model.Subject;

public interface SubjectService {
	public void addSubject(Subject Subject);

    public void updateSubject(Subject Subject);

    public void removeSubject(int id);

    public List<Subject> getAllSubject();

    public Subject getSubjectById(int id);

    public Subject grtSubjectByName(Subject name);


}
