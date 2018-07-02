package org.cj.spring.play;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Application main
 */
public class SpringApplicationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        X firstX = (X) ac.getBean("x");
        Y firstY = firstX.getY();
        ac.close();
    }
}