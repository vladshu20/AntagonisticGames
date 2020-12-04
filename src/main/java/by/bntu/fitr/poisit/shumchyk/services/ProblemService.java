package by.bntu.fitr.poisit.shumchyk.services;

import by.bntu.fitr.poisit.shumchyk.repositories.ProblemKeeper;
import by.bntu.fitr.poisit.shumchyk.entities.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProblemService {
    @Autowired
    private ProblemKeeper problemKeeper;


    public void setPresetData(Integer numOfRows, Integer numOfCols) {
        Integer tmp = numOfCols + numOfRows;
        if (numOfRows != null && numOfCols != null) {
            System.out.println("preset data correct" + numOfCols.toString() + " " + numOfRows.toString()
                    + " " + tmp);

            Problem problem = new Problem();
            problem.setNumOfRows(numOfRows);
            problem.setNumOfCols(numOfCols);
            problemKeeper.keepProblem(problem);

        }

    }

    public Integer[] getPresetData() {

        return problemKeeper.getPresetData();

    }

    public void setData(Map<String, Integer> form) {
        if (form != null) {
            for (Map.Entry<String, Integer> entry : form.entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        }else{
            System.out.println("hahahah lol? didn't work");
        }
    }
}
