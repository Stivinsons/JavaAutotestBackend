package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImageNegative;
import io.qameta.allure.Feature;
import io.restassured.builder.MultiPartSpecBuilder;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UploadingVideoInImage extends BaseTestImageNegative {

    @Test
    @DisplayName("Загрузка видео через изображение")
    @Feature("Negative test: Upload video")
    void uploadVideoTest() {

        requestSpecification = new RequestSpecBuilder()
                .addHeader("Authorization", token)
                .build();

        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectStatusLine("HTTP/1.1 400 Bad Request")
                .build();

        multiPartSpec = new MultiPartSpecBuilder(Video)
                .controlName("image")
                .build();

        requestSpecification = requestSpecification
                .multiPart(multiPartSpec);

        given()
                .spec(requestSpecification)
                .when()
                .post(POST_IMAGE)
                .prettyPeek()
                .then()
                .spec(responseSpecification);
    }


}
