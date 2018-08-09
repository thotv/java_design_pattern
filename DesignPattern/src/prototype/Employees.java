package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ThoTV on 03/08/2018 !
 */
public class Employees {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }
    public Employees(List<String> lsTemp){
        this.empList = lsTemp;
    }
    public void loadData() {
        empList.add("A");
        empList.add("B");
        empList.add("C");
        empList.add("D");
        empList.add("E");
    }

    public List<String> getEmpList() {
        return this.empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> lsTemp = new ArrayList<>();
        try {
            if (!this.empList.isEmpty()) {
                for (String strTemp : this.empList){
                    lsTemp.add(strTemp);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
        return new Employees(lsTemp);
    }
}
class PrototypeTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.loadData();
        try {
            Employees employees1 = (Employees) employees.clone();
            Employees employees2 = (Employees) employees.clone();
            employees1.getEmpList().add("H");
            employees2.getEmpList().remove("A");
            System.out.println(employees.getEmpList());
            System.out.println(employees1.getEmpList());
            System.out.println(employees2.getEmpList());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}