package qaguru.homework;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.homework.config.ApiConfig;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class ApiTests {

    @Test
    public void apiTest(){
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        given()
                .contentType(JSON)
                .body("{\"email\": \"" + config.getEmail() + "\"," +
                        "\"password\": \"" + config.getPassword() +"\"}")
                .when()
                .post(config.baseUrl()+"api/login")
                .then()
                .statusCode(200);
    }
}
