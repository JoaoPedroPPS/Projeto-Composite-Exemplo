package model;

public class FinancialDepartment implements Department {

    public FinancialDepartment(int id, String name) {
         this.id = id;
        this.name = name;
    }

    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}