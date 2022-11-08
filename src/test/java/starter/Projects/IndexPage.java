package starter.Projects;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class IndexPage {
    private String url;

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/hello";
    }

    public void requestGetindex(){
        given().when().get(url);
    }

    public void getMessage200(){
        then().statusCode(200);
    }
}
