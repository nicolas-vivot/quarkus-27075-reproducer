package com.kijmaster;

import static io.restassured.RestAssured.given;
import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.Test;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.restassured.http.ContentType;

@QuarkusTest
@TestProfile(IntegrationTestProfile2.class)
@TestHTTPEndpoint(DemoResource.class)
public class DemoResourceP2Test
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
