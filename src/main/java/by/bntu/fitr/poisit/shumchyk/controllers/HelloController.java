package by.bntu.fitr.poisit.shumchyk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import services.ProblemService;

import java.util.Map;

@Controller
public class HelloController {
    @Autowired
    private ProblemService problemService;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/")
    public String inputDataTable(@RequestParam Integer numOfRows,
                                @RequestParam Integer numOfCols,
                                 @RequestParam Map<String, Object> model){
        return "index";
    }

    @PostMapping("/preset")
    public String inputPreSetData(@RequestParam Integer numOfRows,
                                 @RequestParam Integer numOfCols,
                                 @RequestParam Map<String, Object> model){
        problemService.checkPresetData(numOfRows, numOfCols);

        return "index";
    }


}
