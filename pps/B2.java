package pps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B2 {
    Map<Integer, Employee> map = new HashMap<>();
    int answer = 0;
    public int getImportance(List<Employee> employees, int id) {
        for (Employee emp : employees) {
            map.put(emp.id, emp); 
        }
        dfs(id);
        return answer;
    }

    public void dfs(int sub_id){
        Employee emp = map.get(sub_id);
        answer+=emp.importance;
        for(int sub:emp.subordinates){
            dfs(sub);
        }
    }

}
