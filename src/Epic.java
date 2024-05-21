import java.util.ArrayList;

public class Epic extends Task{
    private ArrayList<Integer> subTaskList = new ArrayList<>();

 /*   public Epic(String name, String description, int taskId, Status status, ArrayList<Integer> subTaskListById) {
        super(name, description, taskId, status);
        this.subTaskList  = subTaskListById;
    } */

    public Epic(String name, String description) {
        super(name, description);
        //    this.subTaskListById  = subTaskListById;
    }

    public Epic(String name, String description, int taskId) {
        super(name, description, taskId);
    }

    public ArrayList<Integer> getSubTaskList() {
        return subTaskList;
    }

    public void removeSubTaskByEpicId(int id) {
        subTaskList.remove(id);
    }
}
