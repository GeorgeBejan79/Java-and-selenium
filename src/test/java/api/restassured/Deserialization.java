package api.restassured;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
public class Deserialization {
    @Test
    public void test() {
        RestAssured.baseURI = "https://corona.lmao.ninja/v2/states/Illinois";
        Response response = given()
                .accept("application/json")
                .when()
                .get("")
                .then()
                .statusCode(200)
                .contentType("application/json").extract().response();
        Map<String, Object> parsedResponse = response.as(new TypeRef<Map<String, Object>>() {
        });
        MatcherAssert.assertThat(parsedResponse.get("state"), Matchers.is("Illinois"));
    }

}
