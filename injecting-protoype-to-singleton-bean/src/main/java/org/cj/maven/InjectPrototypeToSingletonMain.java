package org.cj.maven;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Injecting prototype dependencies into singleton
 *
 */
public class InjectPrototypeToSingletonMain
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        X firstX = (X) ac.getBean("x");
        Y firstY = firstX.getY();

        X secondX = (X) ac.getBean("x");
        Y secondY = secondX.getY();
        System.out.println("do two prototype beans of type Y point to same object: "+firstY.equals(secondY));
        ac.close();
    }
}

// As you can note here, even though we have declared bean Y as prototype, still it is behaving like a singleton bean only.