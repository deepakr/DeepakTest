package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RequestResponse {
    RequestSpecification requestSpecification = given();
    Response response;

    public void getWeatherData(String city, String aqi) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("key", "ac779658445f491ba72170509241402");
        params.put("q", city);
        params.put("aqi", aqi);
        requestSpecification.baseUri("http://api.weatherapi.com/v1/current.json");
       /* requestSpecification.queryParam("key", "ac779658445f491ba72170509241402");
        requestSpecification.queryParam("q", "Delhi");
        requestSpecification.queryParam("aqi", "yes");*/
        requestSpecification.queryParams(params);
        response = given().spec(requestSpecification).get();
    }

    public void validateData(String city, String aqi) {
        Assert.assertEquals(response.statusCode(), 200);
    }
}
