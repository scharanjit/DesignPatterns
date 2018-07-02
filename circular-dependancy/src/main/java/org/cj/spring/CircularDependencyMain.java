package org.cj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Circular dependencies in Spring
 *
 */
public class CircularDependencyMain
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        A a = (A) ac.getBean("a");
        a.doSomeThing();
        ac.close();

    }
}