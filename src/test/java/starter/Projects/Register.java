package starter.Projects;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Register  {

    private String url, body;

    public void setUrlregister() { url = "https://alta-shop.herokuapp.com/api/auth/register";}

    public JSONObject inputValidEmailvalidPassvalidfullName() {
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputValidEmailvalidPassNullFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "123123");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidEmailnullpassnullName(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputnullEmailValidPassvalidFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "123123");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputnullEmailnullPasswordValidFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public JSONObject inputNullEmailnullPasswordnullFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputnullEmailValidPasswordnullName(){
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "123123");
        body.put("fullname", "");
        return body;
    }

    public JSONObject inputValidEmailnullPasswordvalidFullname(){
        JSONObject body = new JSONObject();
        body.put("email", "someone@mail.com");
        body.put("password", "");
        body.put("fullname", "Firstname Lastname");
        return body;
    }

    public void registrasiWithValidEmailPasswordFullname(){
        given().header("Content-Type","application/json");
        given().body(inputValidEmailvalidPassvalidfullName());
        when().post(url);
    }

    public void registrasiWithValidEmailnullPassnullName(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailnullpassnullName());
        when().post(url);
    }
    public void registrasiWithnullEmailvalidPasswordvalidName(){
        given().header("Content-Type", "application/json");
        given().body(inputnullEmailValidPassvalidFullname());
        when().post(url);
    }

    public void registrasiWithnullEmailnullPasswordvalidName(){
        given().header("Content-Type", "application/json");
        given().body(inputnullEmailnullPasswordValidFullname());
        when().post(url);
    }

    public void registrasiWithnullEmailvalidPasswordnullName(){
        given().header("Content-Type", "application/json");
        given().body(inputnullEmailValidPasswordnullName());
        when().post(url);
    }

    public void registrasiWithnull(){
        given().header("Content-Type","application/json");
        given().body(inputNullEmailnullPasswordnullFullname());
        when().post(url);
    }

    public void registrasiWithValidEmailnullPasswordvlidName(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailnullPasswordvalidFullname());
        when().post(url);
    }

    public void registrasiWithValidEmailvalidPasswordnullName(){
        given().header("Content-Type", "application/json");
        given().body(inputValidEmailvalidPassNullFullname());
        when().post(url);
    }

    public void emailIsRequired(){
        then().body("error", Matchers.equalTo("email is required"));
    }

    public void passwordIsRequired() {
        then().body("error", Matchers.equalTo("password is required"));
    }

    public void fullnameIsRequired() { then().body("error", Matchers.equalTo("fullname is required"));}

    public void statusCode400() { then().statusCode(400);}

}
