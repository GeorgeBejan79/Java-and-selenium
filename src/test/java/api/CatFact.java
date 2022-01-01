package api;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class CatFact {
    @Test
    public void catFactLengthTest() throws URISyntaxException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();

        URIBuilder uriBulder = new URIBuilder();
        uriBulder.setScheme("http").setHost("catfact.ninja/fact").setPath("fact");
        HttpGet httpGet = new HttpGet(uriBulder.build());
        //set Accept header to let server know that we expect json data type in the response
        httpGet.setHeader("Accept", "application/json");
        HttpResponse response = httpClient.execute(httpGet);  //it is like clicking on get in postman

//        Assert assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
//        ObjectMapper objectMapper= new ObjectMapper();
//        Map<String,Object> parsedResponse = objectMapper.readValue(response.getEntity().getContent(),
//                new TypeReference<Map<String, Object>>(){});
//        String fact= String.valueOf(parsedResponse.get("fact"));
//
//        int length =(int)parsedResponse.get("length");
        //Assert.assertEquals(fact.length(),length);
    }

    @Test
    public void factsLimitsTest() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http").setHost("catfact.ninja").setPath("facts");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.setHeader("Accept", "application/json");

        HttpResponse response = client.execute(httpGet);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

//        ObjectMapper objectMapper = new ObjectMapper() {
//
//        };
//        Map<String, Object> parsedResponse = objectMapper.readValue(response.getEntity().getContent(), new TypeReference<Map<String, Object>>() {
//        });
//        int factsPerPage =(int) parsedResponse.get("per_page");
//        List<Map<String,Object>>facts = (List<Map<String, Object>>) parsedResponse.get("data");
       // Assert.assertEquals(factsPerPage,facts.size());
    }
}