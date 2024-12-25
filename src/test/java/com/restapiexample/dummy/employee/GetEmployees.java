package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetEmployees extends TestBase {

    @Test
    public void getAllEmployees() {

        Response response = given()
                .log().all() // Log request details
                .header("Cookie", "humans_21909=1")
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleEmployee() {
        Response response = given()
                .header("Cookie","humans_21909=1")
                .pathParam("id",2)
                .when()
                .get("/employee/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
