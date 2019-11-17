package tn.zelda.projects.microservice.ordermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = {
        OrderMicroserviceApplication.class,
        Jsr310JpaConverters.class
})
@SpringBootApplication
public class OrderMicroserviceApplication /*implements CommandLineRunner*/ {


    public static void main(String[] args) {
        SpringApplication.run(OrderMicroserviceApplication.class, args);
    }

//    private static final Logger log = LoggerFactory.getLogger(OrderMicroserviceApplication.class);
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(OrderMicroserviceApplication.class, args);
//    }
//
//    @PostConstruct
//    void init() {
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        log.debug("OrderMicroservice command line runner!");
//
//        //init phase normally product should already exits in db
//        Product product = new Product("Microservices", "ms_ebook", 50);
//        productRepository.save(product);
//
//
//        Order order = new Order();
//        Set<OrderDetail> odSet = order.getOrdersDetails();
//        System.out.println(odSet);
//        odSet.add(new OrderDetail(product, order));
//        try {
//            orderRepository.save(order);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//
//            WebClient.create("http://localhost:8080").method(HttpMethod.GET).retrieve().bodyToMono(String.class);
//
//            System.out.println("CommandLineRunner running in the UnsplashApplication class...");
//        };
//    }
}
