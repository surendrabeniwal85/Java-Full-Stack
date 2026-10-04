package ModernJava.Day13;

import java.util.Optional;

//Precations of Null by Old Method

public class a2 {

    public static void main(String[] args) {
        //User user = getUser();
        Optional<User> user = getUser();
    //     // Precaution by old method
    //     if (user != null) {
    //         Address address = user.adress;
    //         if (address != null) {
    //             String city = address.city;
    //             if (city != null) {
    //                 System.out.println(city);
    //             } else {
    //                 System.out.println("City is Null");
    //             }
    //         } else {
    //             System.out.println("Adress is null");
    //         }
    //     } else

    //     {
    //         System.out.println("User is Null");
    //     }

      user.map(x -> x.adress)
          .map(y -> y.city)
          .ifPresent(System.out::println);
    }

    private static Optional<User> getUser() {
        Address a = new Address();
        a.city = "Jaipur";

        User u = new User();
        u.adress = a;
        //return u;
        return Optional.of(u);

    }

    static class User {
        public Address adress;
    }

    static class Address {
        public String city;
    }
}