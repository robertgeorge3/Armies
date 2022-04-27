package app.Grid;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class Grid {

    @RequestMapping("/")
    public String begin(){
        return "Game.html";
    }

    @PostMapping("setGrid")
    public String setNumGrid(String gridNum, Model model){
        model.addAttribute("incorrectPassword", ".cell-"+gridNum+"{background:red;}");
        return "Game.html";

    }



}
