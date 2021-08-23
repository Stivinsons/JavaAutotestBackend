package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImage;
import HWImgurBack.UploadImageResponePositive;
import io.qameta.allure.Feature;
import io.restassured.builder.MultiPartSpecBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UploadingImageJpgTest extends BaseTestImage {

    @Test
    @DisplayName("Загрузка изображения в формате JPG")
    @Feature("Positive test: Upload image.jpg")
    void uploadImageJpgTest() {

        multiPartSpec = new MultiPartSpecBuilder(imageJpg)
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