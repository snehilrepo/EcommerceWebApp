package com.productservice.productservice;

import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Order;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final PriceRepository priceRepository;

    public ProductServiceApplication(
            CategoryRepository categoryRepository, ProductRepository productRepository,
            PriceRepository priceRepository) {
        this.categoryRepository = categoryRepository;

        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }
    /* private MentorRepository mentorRepository;

     private StudentRepository studentRepository;

     private UserRepository userRepository;
*/

   /* private MentorRepository mentorRepository;
    private StudentRepository studentRepository;
    private UserRepository userRepository;
    private CategoryRepository categoryRepository;
*/
    /*ProductServiceApplication(
            @Qualifier("st_userRepository") UserRepository userRepository,
            @Qualifier("st_studentRepository")StudentRepository studentRepository,
            @Qualifier("st_mentorRepository") MentorRepository mentorRepository,
            CategoryRepository categoryRepository){
        this.studentRepository=studentRepository;
        this.userRepository=userRepository;
        this.mentorRepository=mentorRepository;
        this.categoryRepository=categoryRepository;

    }*/

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


        /*Category category=new Category();
        category.setName("Apple devices");

         Category savedCategory=categoryRepository.save(category);
      */

  /*   Optional<Category> optionalCategory=    categoryRepository.findById(UUID.fromString("dddd2369-759b-4c1e-bce6-433f823fc68e"));
      if(optionalCategory.isEmpty()){
          throw  new Exception("category was null");
      }
      Category category= optionalCategory.get();*/
       /* Product product=new Product();
        product.setTitle("IPhone15");
        product.setDescription("Best Iphone ever");
        product.setCategory(optionalCategory.get());
         Product savedProduct=   productRepository.save(product);
*/
//find all product with category =apple devices
      /*  List<Product> productList=category.getProducts();//SQL Query
        for(Product product1:productList){
            System.out.println(product1.getTitle());
        }
*/


        Price price=new Price();
        price.setCurrency("INR");
        price.setValue(2300);
       // Price SavedPrice=priceRepository.save(price);

        Category category=new Category();
        category.setName("Apple Products");
        Category savedCategory=categoryRepository.save(category);

        Product product=new Product();
        product.setTitle("IPhone 15 Pro");
        product.setDescription("Best Iphone Ever");
        product.setCategory(savedCategory);
        product.setPrice(price);
        Product savedProduct= productRepository.save(product);

        /*Optional<Price> price=priceRepository.findById(UUID.fromString("97415f14-420e-46ea-9078-31d2bce088af"));

        if(price.isEmpty()){
            throw new RuntimeException("Price is empty");
        }
        Price price1=price.get();*/
       // priceRepository.deleteById(UUID.fromString("97415f14-420e-46ea-9078-31d2bce088af"));
   // productRepository.deleteById(UUID.fromString("7655b0bd-3a6e-45d4-a510-e532f6866ddc"));
    }
}
