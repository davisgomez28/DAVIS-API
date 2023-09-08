package org.example;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestDos {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetStatusCode() {
        when()
                .get("/todos")
                .then()
                .statusCode(200)
                .body("title", hasItem("explicabo enim cumque porro aperiam occaecati minima"));
    }
}
