package task1.model;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Tasks> tasksList=new ArrayList<>();

    static {
      tasksList.add(
              new Tasks(
                      1l,
                      "Java EE Spring Task 2-3",
                      "Create a WEB application using servlets and jsp. " +
                              "The project is related to task management.",
                      "09.04.2023"
              )
      );
      tasksList.add(
              new Tasks(
                      2l,
                      "Java EE Spring Task 4-1",
                      "Use JDBC technology (MySQL or PostgreSQL) as data storage. This is a mini online store." +
                              " We will have a list of all the products.",
                      "12.04.2023"
                    )
            );
      tasksList.add(
              new Tasks(
                      3l,
                      "Java EE Final Task",
                      "Your task of this project is to create a news web portal where the admin can post posts.",
                      "02.05.2023"
                )
        );

    }
    public static ArrayList<Tasks> getAllTasks(){
        return tasksList;
    }
    void addTask(Tasks task){
          tasksList.add(task);
    }

    public static Tasks getTask(Long id){
        return tasksList.
                stream().filter(task->task.getId()==id).findFirst().orElse(null);
    }



    void deleteTask(Long id){
        for (int i = 0; i <tasksList.size() ; i++) {
            if (tasksList.get(i).getId()==id){
                tasksList.remove(i);
                break;
            }
        }
    }

}
