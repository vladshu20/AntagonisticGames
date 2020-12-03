package services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ProblemService {
    public void checkPresetData(Integer numOfRows, Integer numOfCols){
        if (numOfRows != null && numOfCols != null){
            System.out.println("preset data correct");
        }
    }
}
