package ru.karpov.spring.rest.configuration;
/*
This class is replacement of the web.xml file, and dedicate for
 AbstractAnnotationConfigDispatcherServletInitializer class
 */


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer  extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //Replacement for annotationContext from web.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};

    }
}
