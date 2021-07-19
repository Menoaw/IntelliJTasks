package day16_StringDay2;

public class WebName {
    public static void main(String[] args) {

        String url = "www.amazon.com";
        int beginningIndex = url.indexOf(".")+1;
        int endingIndex = url.lastIndexOf(".");
        String name = url.substring(beginningIndex,endingIndex);
        String domain = url.substring(endingIndex+1);
        System.out.println("name = " + name);
        System.out.println("domain = " + domain);

    }
}
