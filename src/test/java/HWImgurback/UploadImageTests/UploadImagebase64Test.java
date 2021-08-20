package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


public class UploadImagebase64Test extends BaseTestImage {

    @Test
    @DisplayName("Загрузка изображения в формате base64")
    @Feature("Positive test: Upload image.base63")
    void uploadImageBase64Test() {
        properties.setProperty("deleteHash" , given()
                .headers("Authorization", token)
                .multiPart("image", encodedFile)
                .expect()
                .body("success", is(true))
                .body("data.id", is(notNullValue()))
                .when()
                .post("https://api.imgur.com/3/image/")
                .prettyPeek()
                .then()
                .extract()
                .response()
                .jsonPath()
                .getString("data.deletehash"));
    }
}