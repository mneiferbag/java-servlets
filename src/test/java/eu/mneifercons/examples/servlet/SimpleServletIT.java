/*
 * Copyright (c) 2022 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in project root directory.
 */
package eu.mneifercons.examples.servlet;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class SimpleServletIT {

    @Test
    public void testResponse() {
        get("/simple").then().statusCode(200).extract().body().asString().equals("hello world");
    }
}
