package api.restassured;

import api.utils.PayloadUtils;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {
    @Test
    public void test1() {
        String petBody = PayloadUtils.getPayLoad(101081);
        given().header("Accept", "application/json")
                .header("content-Type", "application/json")
                .body(petBody)
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .log().body()
                .extract().response();

//        PetPojo parseResponse = response.as(PetPojo.class);
//        Assert.assertEquals(101080, parseResponse.getId());
//        Assert.assertEquals("Bejan", parseResponse.getName());
//        Assert.assertEquals("created from java code", parseResponse.getStatus());

    }

    @Test
    public void test2() {

//        PetPojo petpojo = new PetPojo();
//        petPojo.setId(999991);
//        petPojo.setName("Snoopy");
//        petPojo.setStatus("RestAssured best pet")
//        given().header("Accept", "apppication/json")
//                .header("Content-Type", "application/json")         //because is post request it has another header
//                .body()
    }
}
