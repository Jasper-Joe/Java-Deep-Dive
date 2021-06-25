import java.net.MalformedURLException;
import java.net.URL;

public class URLclass {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.google.com/search?q=stackoverflow&client=safari&sxsrf=ALeKk02rKGbXWu6WRvfKnjV-L6ubHWTONQ%3A1624593875273&source=hp&ei=01XVYJSdDaaIggeApaPoBQ&iflsig=AINFCbYAAAAAYNVj4yJhvHb0pdXfDJLD_M_qM1MILfum&oq=stackov&gs_lcp=Cgdnd3Mtd2l6EAMYADIECCMQJzIHCAAQhwIQFDIHCAAQhwIQFDIFCAAQsQMyAggAMgIIADICCAAyAggAMgIIADICCAA6CQgjECcQRhD5AToECAAQQzoFCAAQkQI6CwguELEDEMcBEKMCOgUILhCxAzoICC4QxwEQrwE6BwgAELEDEENQuSRY-y9ggTloAHAAeACAAbgBiAGBBpIBAzUuMpgBAKABAaoBB2d3cy13aXo&sclient=gws-wiz");
        print(url.toString());
        print(url.getHost()); // www.google.com
        print(url.getDefaultPort()); // 443
        print(url.getProtocol()); // https
        print(url.getPath()); // /search
        print(url.getFile());
        print(url.getRef());


    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
