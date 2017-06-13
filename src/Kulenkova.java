
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Kulenkova{
    String info() default "It's my own annotation";
	Class expected();
}