/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josealbertocarrero.StickHero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 *
 * @author DaSTer
 */
public class StickHero extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene ventana = new Scene(root, 600, 400);
        primaryStage.setTitle("PongFX");
        primaryStage.setScene(ventana);
        primaryStage.show();
        //Vamos a cambiar el color de la ventana (el fondo en negro)
        ventana.setFill(Color.WHITE);
        //Creación del circulo con la clase Circle
        Circle bola = new Circle(240, 45, 9);
        Rectangle plataforma = new Rectangle (150,100);
        Rectangle cuerpo = new Rectangle (80,110);
        Rectangle pataizquierda = new Rectangle (20,60);
        Rectangle pataderecha = new Rectangle (20,60);
        Rectangle cinta = new Rectangle (80,20);
        Polygon nudo = new Polygon();
        nudo.getPoints().addAll(new Double[]{
            160.0, 40.0,
            150.0, 15.0,
            185.0, 30.0 });
        //Mover la plataforma
        plataforma.setX(150);
        plataforma.setY(150);
        //Mover el cuerpo
        cuerpo.setX(180);
        cuerpo.setY(10);
        //Mover PataIzquierda
        pataizquierda.setX(185);
        pataizquierda.setY(90);
        //Mover PataDerecha
        pataderecha.setX(235);
        pataderecha.setY(90);
        //Mover Cinta
        cinta.setX(180);
        cinta.setY(20);
        //Ahora vamos a cambiar el color de la bola llamando al método setFill que nos permiete cambiarlo
        bola.setFill(Color.WHITE);
        plataforma.setFill(Color.BLACK);
        nudo.setFill(Color.RED);
        cuerpo.setFill(Color.BLACK);
        cinta.setFill(Color.RED);
        cuerpo.setArcHeight(15);
        cuerpo.setArcWidth(15);
        pataizquierda.setArcHeight(15);
        pataizquierda.setArcWidth(15);
        pataderecha.setArcHeight(15);
        pataderecha.setArcWidth(15);
        //El circulo no se muestra hasta que no hacemos un Layout con esta sentencia
        //que vamos a crear a continuacion (hace referencia al root stackpanel que hemos creado en la linea 22)
        root.getChildren().add(plataforma);
        root.getChildren().add(cuerpo);
        root.getChildren().add(pataizquierda);
        root.getChildren().add(pataderecha);
        root.getChildren().add(bola);
        root.getChildren().add(cinta);
        root.getChildren().add(nudo);
    }
}