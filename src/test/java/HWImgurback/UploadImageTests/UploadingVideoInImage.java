package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImageNegative;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class UploadingVideoInImage extends BaseTestImageNegative {

    @Test
    @DisplayName("Загрузка видео через изображение")
    @Feature("Negative test: Upload video")
    void uploadVideoTest() {
        given()
                .headers("Authorization", token)
                .multiPart("image", Video)
                .expect()
                .body("success", is(false))
                .body("data.error.code", is(1003))
                .body("data.error.message", is("File type invalid (1)"))
                .when()
                .post("https://api.imgur.com/3/image/")
                .prettyPeek()
                .then()
                .statusCode(400);
    }


}
