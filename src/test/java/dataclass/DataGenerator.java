package dataclass;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Locale;
//@UtilityClass
public class DataGenerator {
    private DataGenerator() {}


    //@UtilityClass

    public static class Registration {
        private Registration() {}
        public static Users generateInfo (String locale) {
           Faker faker = new Faker(new Locale(locale));

           return new Users(faker.name().fullName(),
                  faker.phoneNumber().phoneNumber(),
                faker.address().cityName());

        }
   }
}
