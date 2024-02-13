package org.example.jpastudent.config;

import org.example.jpastudent.model.Student;
import org.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2002, 7, 19));
        s1.setBornTime(LocalTime.of(11, 2, 32));
        studentRepository.save(s1);

        Student s2 = new Student();
        s2.setName("Torben");
        s2.setBornDate(LocalDate.of(1902, 5, 1));
        s2.setBornTime(LocalTime.of(5, 45, 44));
        studentRepository.save(s2);

        Student s3 = new Student();
        s3.setName("Malene");
        s3.setBornDate(LocalDate.of(1962, 1, 1));
        s3.setBornTime(LocalTime.of(8, 22, 1));
        studentRepository.save(s3);


    }
}
