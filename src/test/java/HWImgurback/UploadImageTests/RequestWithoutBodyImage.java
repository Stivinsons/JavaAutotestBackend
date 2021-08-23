package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImageNegative;
import io.qameta.allure.Feature;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RequestWithoutBodyImage extends BaseTestImageNegative {

    @Test
    @DisplayName("Запрос без image")
    @Feature("Negative test: request without body image")
    void emptyRequest() {

        requestSpecification = new RequestSpecBuilder()
                .addHeader("Authorization", token)
                .build();

        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectStatusLine("HTTP/1.1 400 Bad Request")
                .build();

        given()
                .spec(requestSpecification)
                .when()
                .post(POST_IMAGE)
                .prettyPeek()
                .then()
                .spec(responseSpecification);
    }

}
