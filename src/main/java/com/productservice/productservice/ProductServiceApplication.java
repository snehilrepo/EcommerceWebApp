package com.productservice.productservice;

import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Order;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final PriceRepository priceRepository;

    public ProductServiceApplication(CategoryRepository categoryRepository,
                                     ProductRepository productRepository,
                                     PriceRepository priceRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }

    /*private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final PriceRepository priceRepository;

    public ProductServiceApplication(
            CategoryRepository categoryRepository, ProductRepository productRepository,
            PriceRepository priceRepository) {
        this.categoryRepository = categoryRepository;

        this.productRepository = productRepository;
        this.priceRepository = priceRepository;
    }*/
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
    @Transactional()
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


     /*   Price price=new Price();
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
*/
        /*Optional<Price> price=priceRepository.findById(UUID.fromString("97415f14-420e-46ea-9078-31d2bce088af"));

        if(price.isEmpty()){
            throw new RuntimeException("Price is empty");
        }
        Price price1=price.get();*/
       // priceRepository.deleteById(UUID.fromString("97415f14-420e-46ea-9078-31d2bce088af"));
   // productRepository.deleteById(UUID.fromString("7655b0bd-3a6e-45d4-a510-e532f6866ddc"));
       /* Category category=new Category();
        category.setName("Apple device");
        Category savedCategory=categoryRepository.save(category);

        Price price=new Price();
        price.setValue(100000);
        price.setCurrency("INR");*/

        /*Optional<Price> optionalprice=priceRepository.findById(UUID.fromString("6be2ff86-83c6-4c54-9033-e3c5bcf30cde"));
        if(optionalprice.isEmpty()){
            throw  new Exception("price object is null");
        }
        Price price=optionalprice.get();

        Optional<Category> optionalCategory=categoryRepository.findById(UUID.fromString("5f4e9e65-ffa5-420e-a232-0d06f76c3be6"));

        Category category= optionalCategory.get();
*/
    /*    Product product1=new Product();
        product1.setPrice(price);
        product1.setTitle("Iphone 15 Pro");
        product1.setDescription("Best Iphone ever");
        product1.setImage("IMG");
        product1.setCategory(category);
        Product savedProduct= productRepository.save(product1);


        Price price2=new Price();
        price2.setValue(100000);
        price2.setCurrency("INR");

        Product product2=new Product();
        product2.setPrice(price2);
        product2.setTitle("Iphone 15");
        product2.setDescription("Best Iphone ever");
        product2.setImage("IMG");
        product2.setCategory(category);

        Product savedProduct2= productRepository.save(product2);

        Price price3=new Price();
        price3.setValue(10000);
        price3.setCurrency("INR");

        Product product3=new Product();
        product3.setPrice(price3);
        product3.setTitle("Iphone 14");
        product3.setDescription("Best Iphone ever");
        product3.setImage("IMG");
        product3.setCategory(category);

        Product savedProduct3= productRepository.save(product3);*/
      /*Optional<Category> optionalCategory=categoryRepository.findById(UUID.fromString("0ff85470-8bf3-4d9b-ba7b-0fd0b284b0b4"));
      Category category1=optionalCategory.get();
  */   /* List<Product> productList=category1.getProducts();

        for(Product product:productList){
            System.out.println(product.getTitle());
        }


*/
        /*Category category=new Category();
        category.setName("Samsung");
        Category category1= categoryRepository.save(category);

        Price price=new Price();
        price.setCurrency("INR");
        price.setValue(49000);
         Product product=new Product("Samsung fold5","Samsung foldable phone","S-IMG",category1,price);
        productRepository.save(product);
*/
        //List<Product> products=productRepository.findAllByPrice_ValueGreaterThan(50000);
    }
}
