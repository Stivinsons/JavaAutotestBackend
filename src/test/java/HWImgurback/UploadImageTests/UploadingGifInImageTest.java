package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImage;
import HWImgurBack.UploadImageResponePositive;
import io.qameta.allure.Feature;
import io.restassured.builder.MultiPartSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UploadingGifInImageTest extends BaseTestImage {

    @Test
    @DisplayName("Загрузка Gif через изображение")
    @Feature("Positive test: Upload Gif")
    void uploadGifTest() {

        multiPartSpec = new MultiPartSpecBuilder(Gif)
                .controlName("image")
                .build();

        requestSpecification = requestSpecification
                .multiPart(multiPartSpec);

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
