package datastructure.greedyalgo;

public class JavaClassloaderRtjar {

    public static void main(String[] args) {

        System.out.println("class loader for HashMap: "
                + java.util.HashMap.class.getClassLoader());
        System.out.println("class loader for DNSNameService: "
                + sun.net.spi.nameservice.dns.DNSNameService.class
                .getClassLoader());
        System.out.println("class loader for this class: "
                + JavaClassloaderRtjar.class.getClassLoader());

//        System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());

    }

}
//VERY IMPORTANT

/**
 *
 * What is Java ClassLoader?

 We know that Java Program runs on Java Virtual Machine (JVM).
 When we compile a Java Class, it transforms it in the form of bytecode
 that is platform and machine independent compiled program and store
 it as a .class file. After that when we try to use a Class,
 Java ClassLoader loads that class into memory.

 There are three types of built-in ClassLoader in Java:

 =>Bootstrap Class Loader – It loads JDK internal classes, typically
 loads rt.jar and other core classes for example java.lang.* package classes

 =>Extensions Class Loader – It loads classes from the JDK extensions
 directory, usually $JAVA_HOME/lib/ext directory.

 =>System Class Loader – It loads classes from the current classpath
 that can be set while invoking a program using -cp or -classpath
 command line options.

 Java ClassLoader are hierarchical and whenever a request is raised to
 load a class, it delegates it to its parent and in this way uniqueness
 is maintained in the runtime environment. If the parent class loader
 doesn’t find the class then the class loader itself tries to load the class.
 *
 *
 * Why write a Custom ClassLoader in Java?

 Java default ClassLoader can load files from local file system
 that is good enough for most of the cases. But if you are expecting a
 class at the runtime or from FTP server or via third party web service
 at the time of loading the class then you have to extend the existing
 class loader. For example, AppletViewers load the classes from remote
 web server.
 *
 *
 *
 * How does Java ClassLoader Work?

 When JVM requests for a class, it invokes loadClass function of the
 ClassLoader by passing the fully classified name of the Class.

 loadClass function calls for findLoadedClass() method to check that
 the class has been already loaded or not. It’s required to avoid loading
 the class multiple times.

 If the Class is not already loaded then it will delegate the request to
 parent ClassLoader to load the class.

 If the parent ClassLoader is not finding the Class then it will invoke
 findClass() method to look for the classes in the file system.


 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
