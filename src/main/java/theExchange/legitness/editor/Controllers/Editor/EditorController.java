package theExchange.legitness.editor.Controllers.Editor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dawid on 1/18/2016.
 */
@Controller
public class EditorController {

    @RequestMapping("/Editor")
    public String Index(){
        return ("/Editor/Index");
    }
}
