package com.kijmaster;

import static io.restassured.RestAssured.given;
import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.Test;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.restassured.http.ContentType;

@QuarkusTest
@TestProfile(IntegrationTestProfile1.class)
@TestHTTPEndpoint(DemoResource.class)
public class DemoResourceP1Test
{

    @Test
    public void emptyTokenRequest_shouldReturn_badRequestStatus() {

        given().contentType(ContentType.JSON)
                .when()
                .get("/test")
                .then()
                .assertThat()
                .statusCode(Status.OK.getStatusCode());
    }
}
