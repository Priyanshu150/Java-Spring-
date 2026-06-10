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