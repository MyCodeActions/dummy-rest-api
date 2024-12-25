package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends TestBase {

    @Test
    public void deleteUser() {
        given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie","humans_21909=1")
                .pathParam("id",2)
                .when()
                .delete("delete/{id}")
                .then().log().all()
                .statusCode(200);
    }
}
