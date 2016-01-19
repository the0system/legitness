package theExchange.legitness.editor.Controllers.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by dawid on 1/18/2016.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String Index() {
        return ("/Home/Index");
    }
}
