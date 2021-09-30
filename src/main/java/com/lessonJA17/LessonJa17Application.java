package com.lessonJA17;

import com.lessonJA17.domian.University;
import com.lessonJA17.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LessonJa17Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LessonJa17Application.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);


		University university = new University();
		university.setName("TECU");
		university.setLevel(4);
		university.setNumberInstitute(3);
		university.setNumberStudents(4000);
		university.setAddress("street 1");
		service.save(university);

		University university2 = new University();
		university2.setName("ETRU");
		university2.setLevel(5);
		university2.setNumberInstitute(10);
		university2.setNumberStudents(50000);
		university2.setAddress("street 2");
		service.save(university2);

		University university3 = new University();
		university3.setName("WERUY");
		university3.setLevel(6);
		university3.setNumberInstitute(4);
		university3.setNumberStudents(6000);
		university3.setAddress("street 3");
		service.save(university3);

		University university4 = new University();
		university4.setName("ELKTU");
		university4.setLevel(7);
		university4.setNumberInstitute(4);
		university4.setNumberStudents(20000);
		university4.setAddress("street 4");
		service.save(university4);

		System.out.println(service.findById((long)1));
		System.out.println(service.findByAddress("street 4"));

		University university1 = service.findById((long)3);
		university1.setName("WERTTU");
		service.update(university1);
		service.findAll().stream().forEach(System.out::println);
		service.deleteById((long)4);



	}

}
