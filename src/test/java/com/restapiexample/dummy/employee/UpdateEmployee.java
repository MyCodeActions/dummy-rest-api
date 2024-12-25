package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.model.DummyRestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployee extends TestBase {

    @Test
    public void updateUserinfo() {
        DummyRestApiPojo dummyRestApiPojo = new DummyRestApiPojo();

        dummyRestApiPojo.setName("Prashant Patel");
        dummyRestApiPojo.setSalary(2000);

        Response response = given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("age", 7266)
                .when()
                .body(dummyRestApiPojo)
                .put("update/{age}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
