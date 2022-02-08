package datastructure.xxSolution;


/**
 * What techniques does Grails use to mitigate against XSS attacks?
 * Cross Site Scripting (XSS) Prevention
 * Solution:-
 * <p>
 * Cross Site Scripting (XSS) attacks are a common attack vector
 * for web applications. They typically involve submitting HTML or
 * Javascript code in a form such that when that code is displayed,
 * the browser does something nasty. It could be as simple as popping up
 * an alert box, or it could be much worse. The solution is to escape all
 * untrusted user input when it is displayed in a page. For examplewithoutbridge,
 * <script>alert('Got ya!');</script>
 * will become
 * <p>
 * &lt;script&gt;alert('Got ya!');&lt;/script&gt;
 * when rendered, nullifying the effects of the malicious input.
 * <p>
 * By default, Grails plays it safe and escapes all content in ${}
 * expressions in GSPs. All the standard GSP tags are also safe by default,
 * escaping any relevant attribute values.
 * <p>
 * So what happens when you want to stop Grails from escaping some content?
 * There are valid use cases for putting HTML into the database and
 * rendering it as-is, as long as that content is trusted. In such cases,
 * you can tell Grails that the content is safe as should be rendered raw,
 * i.e. without any escaping:
 * <p>
 * <section>${raw(page.content)}</section>
 * The raw() method you see here is available from controllers, tag libraries
 * and GSP pages.
 */
public class GrailsTheory {
}
