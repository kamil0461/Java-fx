module appli.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens appli.todolist to javafx.fxml;
    exports appli.todolist;
}