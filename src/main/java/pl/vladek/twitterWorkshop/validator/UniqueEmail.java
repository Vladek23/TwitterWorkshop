package pl.vladek.twitterWorkshop.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {

    //    String message() default "{UniqueEmail.error.message}";
    String message() default "email already exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
