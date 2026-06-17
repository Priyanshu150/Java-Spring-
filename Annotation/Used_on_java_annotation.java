import java.util.*

// Annotation used over another annotation

/*
    @Target
    - This meta data-annotation will restrict where to use annotation
    Either at method of constructor or field etc 
*/ 

@Target(ElementType.METHOD)
public @interface Override{

}

@Target(ElementType.CONSTRUCTOR, ElementType.METHOD)
public @interface SafeVarargs{

}
/*
Element type:
TYPE
FIELD,
METHOD,
PARAMETER,
CONSTRUCTOR,
LOCAL_VARIABLE,
ANNOTATION_TYPE,
PACKAGE,
TYPE_PARAMETER (allow you to apply on generic types <T>)
TYPE_USE (Java 8 features, allow you to use annotation at all places where type you can declare (like List<@annotation))
*/

@Target(ElementType.ANNOTATION_TYPE)
public @interface Target{
    ElementType[] values;
}

/*
@Retention 
- This meta-annotation tells, how Annotation will be stored in java
    RetentionPolicy.SORUCE: Annotation will be discarded by the compiler itself and it will not be recorded in .CLASS files

    RetentionPolicy.CLASS: Annotation wil be recorded in .class file but will be ignored by JVM at runtime.

    RetentionPolicy.RUNTIME: Annotation will be recorded in .class file + available during runtime.
    Usage of reflection can be done 
*/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SafeVarargs{

}

public class Log{
    @SafeVarargs
    public static void printLogValues(List<Integer> ...logNumberList){
        Object[] objectList = logNumberList;

        List<String> stringValueList = new ArrayList<>();
        stringValueList.add('Hello');
        objectList[0] = stringValueList;
    }
}


/*
    @Documented:
    - By default, Annotations are ignored when java documentation is generated 
    - With this meta-annotation even annotation will come in java docs 
*/

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface MyCustomAnnotation{

}

/*
    @Inherited
    - By default annotation, applied on parent class will not be available for child classes
    - But it present after aplying this meta annotation
    - This meta-annotatin has no effect, if annotation is used other than class 
*/

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface MyCustomAnnotationInherited{

}

/*
    Repeatable
    - allow us to use the same annotation more than once at same place 
    - cannot be implemented before java8
*/

@Repeatable(Categories.class)
@interface Category{
    Stirng name();
}