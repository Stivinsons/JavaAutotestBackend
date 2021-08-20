package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImageNegative;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class UploadingZeroInImageTest extends BaseTestImageNegative {

    @Test
    @DisplayName("Загрузка нуля через изображение")
    @Feature("Negative test: Upload zero")
    void uploadZeroTest() {
         given()
                .headers("Authorization", token)
                .multiPart("image", 0)
                .expect()
                .body("success", is(false))
                .when()
                .post("https://api.imgur.com/3/image/")
                .prettyPeek()
                .then()
                .statusCode(400);
    }
}
