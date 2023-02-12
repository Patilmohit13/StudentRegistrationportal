package com.StudentManagementSystem.StudentManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.StudentManagement.repository.Student;
import com.StudentManagementSystem.StudentManagement.repository.StudentRepository;

@Service
public class StudentService {
	
	// Autowire the StudentRepository for data access
    @Autowired
    private StudentRepository repo;
    
    // Method to retrieve all students from the database
    public List<Student> listAll() {
    	return repo.findAll();
    }
    
    // Method to save a new student or update an existing student
    public void save(Student std) {
        repo.save(std);
    }
    
    // Method to retrieve a student by their id
    public Student get(long id) {
        return repo.findById(id).get();
    }
    
    // Method to delete a student by their id
    public void delete(long id) {
        repo.deleteById(id);
    }

}
