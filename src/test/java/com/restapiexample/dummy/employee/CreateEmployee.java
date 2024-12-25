package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.model.DummyRestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployee extends TestBase {

    @Test
    public void createEmployee() {

        DummyRestApiPojo dummyRestApiPojo = new DummyRestApiPojo();

        dummyRestApiPojo.setName("Prashant K");
        dummyRestApiPojo.setSalary(8000);
        dummyRestApiPojo.setAge(30);
        dummyRestApiPojo.setImage(" ");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .when()
                .body(dummyRestApiPojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
