package Listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
 
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
 
/**
 * Created by ONUR on 17.12.2016.
 */
public class TransformerMethod implements IAnnotationTransformer {
 
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyser.class);
    }
}