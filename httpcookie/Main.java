import java.net.HttpCookie;

public class Main {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("First", "1");
        cookie.setComment("Some explanations");
        p(cookie.getComment());
        cookie.setCommentURL("192.168.1.1");
        p(cookie.getCommentURL());
        cookie.setDiscard(true);
        p(cookie.getDiscard());
        cookie.setDomain(".localhost.com");
        p(cookie.getDomain());
        cookie.setMaxAge(3600);
        p(cookie.getMaxAge());
        cookie.setPath("192.168.1.1/admin/index/html");
        p(cookie.getPath());
        cookie.setSecure(true);
        p(cookie.getSecure());
        cookie.setValue("2");
        p(cookie.getValue());
        cookie.setVersion(1);
        p(cookie.getVersion());
        cookie.setHttpOnly(true);
        p(cookie.isHttpOnly());
        p(cookie.toString());
        p(cookie.hashCode());


    }

    private static void p(Object obj) {
        System.out.println(obj);

    }
}
