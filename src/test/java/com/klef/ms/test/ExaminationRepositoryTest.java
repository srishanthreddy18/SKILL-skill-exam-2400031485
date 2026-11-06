package com.klef.ms.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.klef.ms.entity.Examination;
import com.klef.ms.repository.ExaminationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ExaminationRepositoryTest
{
    @Autowired
    private ExaminationRepository repository;

    @Test
    void testFindAllExaminations()
    {
        List<Examination> examinations = repository.findAll();

        assertNotNull(examinations);

        System.out.println("Total Examinations : " + examinations.size());
    }

    @Test
    void testFindExaminationById()
    {
        Optional<Examination> examination = repository.findById(1L);

        assertTrue(examination.isPresent());

        System.out.println(examination.get());
    }

    @Test
    void testFindByName()
    {
        List<Examination> examinations =
                repository.findByName("Mid Semester Examination");

        assertNotNull(examinations);

        System.out.println(examinations);
    }

    @Test
    void testFindByType()
    {
        List<Examination> examinations =
                repository.findByType("Internal");

        assertNotNull(examinations);

        System.out.println(examinations);
    }

    @Test
    void testDatabaseConnection()
    {
        long count = repository.count();

        assertTrue(count >= 0);

        System.out.println("Total Examinations : " + count);
    }

    @Test
    void testExaminationDetails()
    {
        Optional<Examination> examination =
                repository.findById(1L);

        assertTrue(examination.isPresent());

        Examination e = examination.get();

        assertNotNull(e.getName());
        assertNotNull(e.getType());
        assertNotNull(e.getStatus());
        assertNotNull(e.getLocation());

        System.out.println("Name : " + e.getName());
        System.out.println("Type : " + e.getType());
        System.out.println("Status : " + e.getStatus());
        System.out.println("Location : " + e.getLocation());
    }

    @Test
    void testExaminationTableNotEmpty()
    {
        List<Examination> examinations =
                repository.findAll();

        assertFalse(examinations.isEmpty());
    }
}