package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;


public class AnnotTest {
    @Test1(name = "Platinum")
    public void testMethod() {
        System.out.println("This method is worked hopefully annotation");
    }

    static void readAnnotation(AnnotatedElement annotatedElement) {
        Annotation[] annotations = annotatedElement.getAnnotations();
        for (Annotation a :
                annotations) {
           //Нужно изучать рефлексию аннотаций
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotTest annotTest = new AnnotTest();
        Class<AnnotTest> clazz = AnnotTest.class;
        Method method = clazz.getMethod("testMethod");
        readAnnotation(method);
    }
}
