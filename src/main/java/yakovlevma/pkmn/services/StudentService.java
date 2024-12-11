package yakovlevma.pkmn.services;

import yakovlevma.pkmn.entities.StudentEntity;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    List<StudentEntity> getAllStudents();
    StudentEntity getStudentById(UUID id);
    StudentEntity saveStudent(StudentEntity student);
    StudentEntity updateStudent(UUID id, StudentEntity student);
    void deleteStudent(UUID id);
    List<StudentEntity> getStudentsByGroup(String group);
    StudentEntity getStudentByFullName(String firstName, String surName, String familyName);
    String getCardImageByName(String cardName); // Новый метод
}
