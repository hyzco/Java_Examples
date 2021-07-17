package question9;

public class IncrementCalculation {

    private double appraisalRate;
    private int salary;

    public IncrementCalculation(double appraisalRate, int salary) {
        this.appraisalRate = appraisalRate;
        this.salary = salary;
    }

    public void calculate() {
        if (appraisalRate >= 1 && appraisalRate <= 3) {
            salary = salary + (int) (salary * 0.1);
        } else if (appraisalRate >= 3.1 && appraisalRate <= 4) {
            salary = salary + (int) (salary * 0.25);
        } else if (appraisalRate >= 4.1 && appraisalRate <= 5) {
            salary = salary + (int) (salary * 0.3);
        }
    }

    public int getCalculatedSaray() {
        return salary;
    }

    // If the appraisal rating is between 1 and 3, the increment is 10% of the
    // * salary.
    // *
    // * If the appraisal rating is between 3.1 and 4, the increment is 25% of
    // * the salary.
    // *
    // * If the appraisal rating is between 4.1 and 5, the increment is
    // * 30% of the salary.
}
