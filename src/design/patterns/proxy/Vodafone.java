package design.patterns.proxy;

public class Vodafone implements ISP {

    @Override
    public String getResource(String site) {
        switch (site) {
            case "www.google.com":
                return "GOOOOOOOOOOOGLE";
            case "www.yahoo.com":
                return "YAHOOOOOOOOOOOO";
            default:
                return "Sorry No resource found";
        }
    }
}
