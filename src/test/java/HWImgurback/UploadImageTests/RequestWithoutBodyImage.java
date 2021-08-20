package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImageNegative;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class RequestWithoutBodyImage extends BaseTestImageNegative {

    @Test
    @DisplayName("Запрос без image")
    @Feature("Negative test: request without body image")
    void emptyRequest() {
        given()
                .headers("Authorization", token)
                .expect()
                .body("success", is(false))
                .body("data.error", is("No image data was sent to the upload api"))
                .when()
                .post("https://api.imgur.com/3/image/")
                .prettyPeek()
                .then()
                .statusCode(400);
    }

}
