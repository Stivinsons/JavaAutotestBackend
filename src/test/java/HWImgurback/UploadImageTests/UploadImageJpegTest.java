package HWImgurback.UploadImageTests;

import HWImgurBack.BaseTestImage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class UploadImageJpegTest extends BaseTestImage {

    @Test
    @DisplayName("Загрузка изображения в формате JPEG")
    @Feature("Positive test: Upload image.jpeg")
    void uploadImageJpegTest() {
        properties.setProperty("deleteHash" , given()
                .headers("Authorization", token)
                .multiPart("image", imageJpg)
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
