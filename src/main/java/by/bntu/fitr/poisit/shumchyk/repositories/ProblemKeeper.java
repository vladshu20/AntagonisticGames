package by.bntu.fitr.poisit.shumchyk.repositories;

import by.bntu.fitr.poisit.shumchyk.entities.Problem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProblemKeeper {
    public List <Problem> problemList = new ArrayList<>();

    public void keepProblem(Problem problem){
        problemList.add(problem);
    }

    public Integer[] getPresetData(){
        Problem pr = problemList.get(problemList.size() - 1);

        Integer[] ar = {pr.getNumOfRows(),pr.getNumOfCols()};

        return  ar;
    }

}
