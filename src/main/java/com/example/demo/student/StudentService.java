package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    /**
     * Access to the data layer to fetch students. At current time this is fetching hard coded data
     * but will extend to actually fetch these values from a real database
     * */
    public List<Student> GetStudents() {
        Student alkis = new Student();
        alkis.setId(1L);
        alkis.setAge(31);
        alkis.setDob(LocalDate.of(1992, 7, 5));
        alkis.setEmail("alkisg1992@gmail.com");
        alkis.setName("Alkis");

        Student sotiris = new Student();
        sotiris.setId(2L);
        sotiris.setAge(31);
        sotiris.setDob(LocalDate.of(1992, 12, 5));
        sotiris.setEmail("sotsharingan@gmail.com");
        sotiris.setName("Sotiris");

        return List.of(alkis, sotiris);
    }

}
