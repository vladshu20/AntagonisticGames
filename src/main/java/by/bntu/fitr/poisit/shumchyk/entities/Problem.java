package by.bntu.fitr.poisit.shumchyk.entities;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;

@Component
public class Problem {
    private  Integer numOfCols;
    private  Integer numOfRows;
    private  Integer[] data;

    public Integer getNumOfCols() {
        return numOfCols;
    }

    public void setNumOfCols(Integer numOfCols) {
        this.numOfCols = numOfCols;
    }

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(Integer numOfRows) {
        this.numOfRows = numOfRows;
    }

    public Integer[] getData() {
        return data;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problem problem = (Problem) o;
        return Objects.equals(numOfCols, problem.numOfCols) &&
                Objects.equals(numOfRows, problem.numOfRows) &&
                Arrays.equals(data, problem.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numOfCols, numOfRows);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "numOfCols=" + numOfCols +
                ", numOfRows=" + numOfRows +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public Problem() {
    }

    public Problem(Integer numOfCols, Integer numOfRows, Integer[] data) {
        this.numOfCols = numOfCols;
        this.numOfRows = numOfRows;
        this.data = data;
    }
}
