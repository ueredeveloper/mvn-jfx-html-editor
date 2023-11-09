/**
 * @file Main.java
 * @brief The main class for the application.
 */

package main;

import java.io.IOException;
import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
import models.Documento;
import models.DocumentoTipo;
import utilities.HTMLFileLoader;

/**
 * @class Main
 * @brief The main class of the application that extends JavaFX's Application class.
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
       /* // Create a DocumentoTipo object.
        DocumentoTipo docTipo = new DocumentoTipo(1, "Requerimento");

        // Create a Documento object and set its properties.
        Documento doc = new Documento();
        doc.setDoc_id(1);
        doc.setDoc_numero("12/2015");
        doc.setDoc_processo("197.456789/2013");
        doc.setDoc_sei(123456789);
        doc.setDoc_tipo(docTipo);

        // Convert the Documento object to JSON and print it.
        System.out.println(new Gson().toJson(doc));

        // Load HTML content from a resource file.
        String resourcePath = "/html/index.html";
        String htmlContent = null;

        try {
            htmlContent = HTMLFileLoader.loadHTMLResourceToString(resourcePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("HTMLEditor Sample");
        stage.setWidth(800);
        stage.setHeight(600);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();
        root.setPadding(new Insets(8, 8, 8, 8));
        root.setSpacing(5);
        root.setAlignment(Pos.BOTTOM_LEFT);

        // Create an HTMLEditor.
        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(600);
        htmlEditor.setHtmlText(htmlContent);

        // Get the HTML text from the editor.
        String htmlText = htmlEditor.getHtmlText();

        // Replace a placeholder in the HTML content with JSON data.
        String json = new Gson().toJson(doc);
        htmlText = htmlText.replace("${json}", json);
        htmlEditor.setHtmlText(htmlText);

        // Create a button to copy the HTML text to the clipboard.
        Button btnCopy = new Button("Copiar Texto");

        btnCopy.setOnAction(e -> {
            Clipboard clipboard = Clipboard.getSystemClipboard();
            ClipboardContent content = new ClipboardContent();
            content.putHtml(htmlEditor.getHtmlText());
            clipboard.setContent(content);
        });

        root.getChildren().addAll(htmlEditor, btnCopy);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();*/
    	
    	Parent root = null;
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
			root = fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       Scene scene = new Scene(root, 900, 600);
		//Scene scene = new Scene (root, 1780, 1040);
    
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
