import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Make sure annotation is retained at runtime
@Target(ElementType.METHOD) // Annotation can be applied to methods
public @interface SpecialMethod {
    String value() default "This is a special method"; // Default value for annotation attribute
}
