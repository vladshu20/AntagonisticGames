package by.bntu.fitr.poisit.shumchyk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import by.bntu.fitr.poisit.shumchyk.services.ProblemService;

import javax.jws.WebParam;
import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private ProblemService problemService;

    @GetMapping("/")
    public String mainPage(Model model) {
        return "index";
    }

    @PostMapping("/input")
    public String inputDataTable(@RequestParam Map<String,Integer> form) {

        problemService.setData(form);
        return "index";
    }

    @PostMapping("/alter")
    public String inputDataTableAlter(@RequestParam Map<String,Integer> form) {

        problemService.setData(form);
        return "index";
    }

    @PostMapping("/preset")
    public String inputPreSetData(@RequestParam Integer numOfRows,
                                  @RequestParam Integer numOfCols,
                                  Model model) {
        problemService.setPresetData(numOfRows, numOfCols);


        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        Integer[] presetData = problemService.getPresetData();
        Integer numOfRows = presetData[0];
        Integer numOfCols = presetData[1];
        model.addAttribute("numOfRows",numOfRows);
        model.addAttribute("numOfCols",numOfCols);

        return "index";
    }


}
