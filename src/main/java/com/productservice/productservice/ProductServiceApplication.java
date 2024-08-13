package com.productservice.productservice;

import com.productservice.productservice.inheritanceRelation.singletable.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    /* private MentorRepository mentorRepository;

     private StudentRepository studentRepository;

     private UserRepository userRepository;
*/

    private MentorRepository mentorRepository;
    private StudentRepository studentRepository;
    private UserRepository userRepository;

    ProductServiceApplication(
                              @Qualifier("st_userRepository") UserRepository userRepository,
                              @Qualifier("st_studentRepository")StudentRepository studentRepository,
                              @Qualifier("st_mentorRepository") MentorRepository mentorRepository){
        this.studentRepository=studentRepository;
        this.userRepository=userRepository;
        this.mentorRepository=mentorRepository;

    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
   /*     Mentor mentor=new Mentor();
        mentor.setName("Snehil");
        mentor.setEmail("snehilanand001@gmail.com");
        mentor.setRating(2.4F);
        mentorRepository.save(mentor);

        Student student=new Student();
        student.setEmail("anand@gmail,.com");
        student.setName("anand");
        student.setPsp(56.5F);
        studentRepository.save(student);

        User user=new User();
        user.setEmail("user@gmail.com");
        user.setName("userName");
        userRepository.save(user);

        //get all the users
        List<User> Users=userRepository.findAll();
        for(User user1: Users){
            System.out.println(user1.toString());
        }*/

       User user=new User();
        user.setName("user1");
        user.setEmail("user1@gmail.com");
        userRepository.save(user);

        Student student=new Student();
        student.setName("student1");
        student.setEmail("student1@gmail.com");
        student.setPsp(89.7F);
        studentRepository.save(student);

        Mentor mentor=new Mentor();
        mentor.setRating(8F);
        mentor.setName("mentor1");
        mentor.setEmail("mentor1@gmail.com");
        mentorRepository.save(mentor);




    }
}
