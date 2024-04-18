package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

//      Car car1 = new Car("Lada", 2101);
//      Car car2 = new Car("Kia", 5);
//      Car car3 = new Car("BMW", 520);
//      Car car4 = new Car("Ford", 3);
//
//
//      User user1 = new User("Alex", "Fox", "user1@mail.ru");
//      User user2 = new User("Steve", "Jobs", "user2@mail.ru");
//      User user3 = new User("Bruce", "Wayne", "user3@mail.ru");
//      User user4 = new User("Al", "Pachino", "user4@mail.ru");
//
//      userService.add(user1.setCar(car1).setUser(user1));
//      userService.add(user2.setCar(car2).setUser(user2));
//      userService.add(user3.setCar(car3).setUser(user3));
//      userService.add(user4.setCar(car4).setUser(user4));


//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
      System.out.println(userService.getUserHasCar("Kia", 5));
      context.close();
   }
}
