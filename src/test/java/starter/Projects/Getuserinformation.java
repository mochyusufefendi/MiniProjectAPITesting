package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.*;

public class Getuserinformation {
    private String url;

    public void setValidUrl() {url = "https://alta-shop.herokuapp.com/api/auth/info";}

    public void requestGetuserinformation() { given().when().get(url);}

    public void statusCodemessage401(){then().statusCode(401);}
}
