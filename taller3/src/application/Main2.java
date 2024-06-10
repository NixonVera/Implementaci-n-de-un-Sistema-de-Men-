package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main2 extends Application {

	 @Override
	    public void start(Stage primaryStage) {
	        MenuBar menuBar = new MenuBar();

	        Menu fileMenu = new Menu("Archivo");
	        Menu editMenu = new Menu("Editar");
	        Menu helpMenu = new Menu("Ayuda");

	        MenuItem newFile = new MenuItem("Nuevo");
	        MenuItem openFile = new MenuItem("Abrir");
	        MenuItem saveFile = new MenuItem("Guardar");
	        SeparatorMenuItem separator1 = new SeparatorMenuItem();
	        MenuItem exitApp = new MenuItem("Salir");

	        fileMenu.getItems().addAll(newFile, openFile, saveFile, separator1, exitApp);

	        MenuItem cut = new MenuItem("Cortar");
	        MenuItem copy = new MenuItem("Copiar");
	        MenuItem paste = new MenuItem("Pegar");
	        SeparatorMenuItem separator2 = new SeparatorMenuItem();
	        MenuItem delete = new MenuItem("Eliminar");

	        editMenu.getItems().addAll(cut, copy, paste, separator2, delete);

	        MenuItem about = new MenuItem("Acerca de");
	        helpMenu.getItems().add(about);

	        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

	        newFile.setOnAction(e -> System.out.println("Nuevo archivo seleccionado"));
	        openFile.setOnAction(e -> System.out.println("Abrir archivo seleccionado"));
	        saveFile.setOnAction(e -> System.out.println("Guardar archivo seleccionado"));
	        exitApp.setOnAction(e -> {
	            System.out.println("Salir de la aplicación");
	            primaryStage.close();
	        });

	        cut.setOnAction(e -> System.out.println("Cortar seleccionado"));
	        copy.setOnAction(e -> System.out.println("Copiar seleccionado"));
	        paste.setOnAction(e -> System.out.println("Pegar seleccionado"));
	        delete.setOnAction(e -> System.out.println("Eliminar seleccionado"));

	        about.setOnAction(e -> System.out.println("Acerca de seleccionado"));

	        BorderPane borderPane = new BorderPane();
	        borderPane.setTop(menuBar);

	        Scene scene = new Scene(borderPane, 400, 300);

	        primaryStage.setTitle("Aplicación con Barra de Menú");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}