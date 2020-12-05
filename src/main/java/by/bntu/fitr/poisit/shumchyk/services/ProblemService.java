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
            problemKeeper.addProblem(numOfRows, numOfCols);

        }

    }

    public Integer[] getPresetData() {

        return problemKeeper.getPresetData();

    }

    public void setData(Map<String, Integer> form) {
//        if (form != null) {
//            for (Map.Entry<String, Integer> entry : form.entrySet()) {
//                System.out.println(entry.getKey() + "/" + entry.getValue());
//            }
//        }else{
//            System.out.println("hahahah lol? didn't work");
//        }
        Integer numOfCols = null;
        Integer numOfRows = null;
        try {
            Integer[] presetData = problemKeeper.getPresetData();
            numOfCols = presetData[presetData.length - 1];
            numOfRows = presetData[0];
        } catch (Exception e) {
            e.printStackTrace();
            numOfCols = 3;
            numOfRows = 3;
        }

        String[] inputData = form.values().toArray(new String[0]);

        Integer[][] dataToSet = new Integer[numOfRows][numOfCols];

        int counter = 0;

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                dataToSet[i][j] = Integer.parseInt(inputData[counter]);
                System.out.println(dataToSet[i][j]);
                counter++;
            }
        }

        problemKeeper.setProblemData(dataToSet);
    }

}
