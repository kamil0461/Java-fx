module appli.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens appli.todolist to javafx.fxml;
    exports appli.todolist;
    exports appli.todolist.accueil;
    opens appli.todolist.accueil to javafx.fxml;
}