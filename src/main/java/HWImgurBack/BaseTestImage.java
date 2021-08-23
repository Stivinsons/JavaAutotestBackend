package HWImgurBack;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public abstract class BaseTestImage {
    protected static Properties properties = new Properties();
    protected static String token;
    protected static String username;
    protected static String POST_IMAGE = "https://api.imgur.com/3/image/";
    protected static String PATH_TO_IMAGE_JPG = "src/test/resources/Image1.jpg";
    protected static String PATH_TO_IMAGE_JPEG = "src/test/resources/Image2.jpeg";
    protected static String PATH_TO_GIF = "src/test/resources/Gif1.gif";
    protected static String IMAGE_URL =
            "http://andrey-eltsov.ru/wp-content/uploads/2021/01/yhe382994bh_sh-wago-gh_a7239kkkw_3-6mjh_j-" +
                    "amerikanskaja-kunica-martes-americana.jpg";
    protected static File Gif;
    protected static File imageJpeg;
    protected static File imageJpg;
    protected static String encodedFile;
    protected static ResponseSpecification responseSpecification = null;
    protected static UploadImageResponePositive uploadImageResponsePositive = null;
    protected static RequestSpecification requestSpecification = null;
    protected static MultiPartSpecification multiPartSpec = null;

    @BeforeAll
    static void beforeAll() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(); //включение логирования
        RestAssured.filters(new AllureRestAssured());
        getProperties();

        token = properties.getProperty("token");
        username = properties.getProperty("username");
        imageJpg = new File(PATH_TO_IMAGE_JPG);
        imageJpeg = new File(PATH_TO_IMAGE_JPEG);
        Gif = new File(PATH_TO_GIF);

        //Конвертирование изображения в формат base64
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH_TO_IMAGE_JPG);
            byte[] byteArray = new byte[(int) imageJpg.length()];
            fileInputStream.read(byteArray);
            encodedFile = Base64.getEncoder().encodeToString(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Общие проверки ответов при положитльном тесте image
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine("HTTP/1.1 200 OK")
                .expectContentType(ContentType.JSON)
                .build();

        //Общий запрос Image
        requestSpecification = new RequestSpecBuilder()
                .addHeader("Authorization", token)
                .build();
    }

    @AfterEach
    void tearDown() {
        given()
                .headers("Authorization", token)
                .when()
                .delete("https://api.imgur.com/3/account/{username}/image/{deleteHash}",
                        "testprogmath", properties.getProperty("deleteHash"))
                .prettyPeek()
                .then()
                .statusCode(200);
    }

    private static void getProperties() {
        try (InputStream output= new FileInputStream("src/test/resources/application.properties")){
            properties.load(output);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
