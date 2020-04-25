package beginner.five.abstractfactorypattern;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DocumentBuilderAbsFacExample {


  public static void main(String[] args)
      throws ParserConfigurationException, IOException, SAXException {


    String xml = "<document><body> <stock> AAPL </stock> </body> </document>";
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());

    DocumentBuilderFactory abstractFactory  = DocumentBuilderFactory.newInstance();

     DocumentBuilder factory = abstractFactory.newDocumentBuilder();

     Document document = factory.parse(byteArrayInputStream);


     document.getDocumentElement().normalize();

    System.out.println(document.getDocumentElement().getNodeName());

    System.out.println(abstractFactory.getClass());

    System.out.println(factory.getClass());

  }

}
