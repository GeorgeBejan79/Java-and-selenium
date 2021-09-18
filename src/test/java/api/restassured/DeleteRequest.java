package api.restassured;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequest {
    @Test
    public void test() {
        RestAssured.baseURI="https://petstore.swagger.io/v2/pet/070379";
        given().accept("application/json")
                .when().delete()
                .then()
                .statusCode(404)
                .and()
                .body("type", Matchers.equalTo("unknown"));
    }
    @Test
    public void test1(){
        given().accept("application/json")
                .when()
                .get()
                .then()
                .statusCode(200);

        given().accept("application/json")
                .when()
                .delete()
                .then()
                .statusCode(200)
                .body("type", Matchers.equalTo("unknown"));

        given().accept("application/json")
                .when()
                .get()
                .then()
                .statusCode(404);
    }
}
