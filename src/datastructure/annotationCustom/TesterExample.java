package datastructure.annotationCustom;


@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "mkyong.com",
        tags = {"sales","test" }
)
public class TesterExample {

    @Test
    void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

}