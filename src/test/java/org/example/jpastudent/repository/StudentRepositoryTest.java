package org.example.jpastudent.repository;

import org.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneTime() {
        List<Student> lst = studentRepository.findAllByName("Malene");
        assertEquals(0, lst.size());
    }

/*    @Test
    void testOneTime2() {
        List<Student> lst = studentRepository.findAllByName("Malene");
        assertEquals(1, lst.size());


    }*/
}