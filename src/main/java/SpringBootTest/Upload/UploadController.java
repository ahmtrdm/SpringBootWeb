package SpringBootTest.Upload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    @RequestMapping("/upload")
    public String uploadFile() {
        return "HI";
    }

}
