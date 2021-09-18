package api.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StatePojo {
    private String state;
    private long updated;
    private long cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private long recovered;
    private int active;
    private int casesPerOneMillion;
    private int deathsPerOneMillion;
    private long tests;
    private long testsPerOneMillion;
    private long population;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public long getCases() {
        return cases;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(int casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public int getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(int deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public long getTests() {
        return tests;
    }

    public void setTests(long tests) {
        this.tests = tests;
    }

    public long getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(long testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Test
    public void test1() {
        RestAssured.baseURI = "https://corona.lmao.ninja/v2/states/Illinois";
        Response response = given().accept("application/json")
                .when()
                .get("")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();
        StatePojo parsedResponse = response.as(StatePojo.class);
        MatcherAssert.assertThat(parsedResponse.getPopulation(), Matchers.equalTo(12671821L));
    }
}
