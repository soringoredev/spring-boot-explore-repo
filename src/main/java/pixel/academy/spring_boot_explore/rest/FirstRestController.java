package pixel.academy.spring_boot_explore.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${teacher.name}")
    private  String teacherName;

    @Value("${teacher.subject}")
    private  String teacherSubject;

    @Value("${teacher.experience}")
    private  String teacherExperience;

    @Value("${teacher.department}")
    private  String teacherDepartment;
}
