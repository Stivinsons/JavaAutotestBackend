package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImage;
import HWImgurBack.UploadImageResponePositive;
import io.qameta.allure.Feature;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UploadingTwoImage extends BaseTestImage {

    @Test
    @DisplayName("Загрузка двух изображений")
    @Feature("Positive test: Upload two images")
    void uploadTwoImageTest() {

        requestSpecification = new RequestSpecBuilder()
                .addHeader("Authorization", token)
                .addMultiPart("image", imageJpeg)
                .addMultiPart("image", imageJpg)
                .build();

        uploadImageResponsePositive = given()
                .spec(requestSpecification)
                .when()
                .post(POST_IMAGE)
                .prettyPeek()
                .then()
                .spec(responseSpecification)
                .extract()
                .body()
                .as(UploadImageResponePositive.class);

        properties.setProperty("deleteHash", uploadImageResponsePositive.getData().getDeletehash());
    }
}
