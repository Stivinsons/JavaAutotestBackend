package HWImgurBack;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;

public abstract class BaseTestImageNegative {
    protected static Properties properties = new Properties();
    protected static String token;
    protected static String username;
    protected static String PATH_TO_IMAGE_JPG = "src/test/resources/Image1.jpg";
    protected static String PATH_TO_IMAGE_JPEG = "src/test/resources/Image2.jpeg";
    protected static String PATH_TO_GIF = "src/test/resources/Gif1.gif";
    protected static String IMAGE_URL =
            "http://andrey-eltsov.ru/wp-content/uploads/2021/01/yhe382994bh_sh-wago-gh_a7239kkkw_3-6mjh_j-" +
                    "amerikanskaja-kunica-martes-americana.jpg";
    protected static String PATH_TO_VIDEO = "src/test/resources/video1.mp4";
    protected static File Video;
    protected static File Gif;
    protected static File imageJpeg;
    protected static File imageJpg;
    protected static String encodedFile;

    @BeforeAll
    static void boforeAll() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(); //включение логирования
        RestAssured.filters(new AllureRestAssured());
        getProperties();
        token = properties.getProperty("token");
        username = properties.getProperty("username");
        imageJpg = new File(PATH_TO_IMAGE_JPG);
        imageJpeg = new File(PATH_TO_IMAGE_JPEG);
        Gif = new File(PATH_TO_GIF);
        Video = new File(PATH_TO_VIDEO);
        //Конвертирование изображения в формат base64
            try {
                FileInputStream fileInputStream = new FileInputStream(PATH_TO_IMAGE_JPG);
                byte[] byteArray = new byte[(int) imageJpg.length()];
                fileInputStream.read(byteArray);
                encodedFile = Base64.getEncoder().encodeToString(byteArray);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
