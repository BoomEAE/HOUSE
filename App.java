package com.mycompany.housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage mainStage) {
        
        // Constants for the scene size
        final double sceneWidth = 500.0;
        final double sceneHeight = 500.0;
        
        //Circle
        Circle sun = new Circle(sceneWidth-50, 50, 50);
        sun.setStroke(Color.YELLOW);
        sun.setFill(Color.YELLOW);
        
        //Lines
        Line ray1 = new Line();
        Line ray2 = new Line();
        Line ray3 = new Line();
        Line ray4 = new Line();
        Line windowLine1 = new Line(205, 300, 205, 350);
        Line windowLine2 = new Line(180, 325, 230, 325);
        Line windowLine3 = new Line(335, 300, 335, 350);
        Line windowLine4 = new Line(310, 325, 360, 325);
        
        //Polygons
        Polygon roof = new Polygon(270, 120, 160, 230, 380, 230);
        roof.setFill(Color.RED);
        Polygon en = new Polygon();
        
        //Rectangles
        Rectangle chimney = new Rectangle(250, 140, 25, 75);
        chimney.setFill(Color.GRAY);
        Rectangle buidling = new Rectangle(160, 230, 220, 220);
        buidling.setFill(Color.LIGHTGRAY);
        Rectangle window1 = new Rectangle(180, 300, 50, 50);
        window1.setFill(Color.LIGHTBLUE);
        Rectangle window2 = new Rectangle(310, 300, 50, 50);
        window2.setFill(Color.LIGHTBLUE);
        Rectangle door = new Rectangle(sceneWidth/2, 340, 50, 110);
        door.setFill(Color.BROWN);
        Rectangle grass = new Rectangle(0, sceneHeight-50, sceneWidth, 50);
        grass.setStroke(Color.GREEN);
        grass.setFill(Color.GREEN);
        
        //
        Pane root = new Pane();
        root.getChildren().addAll(sun, grass, roof, buidling, door, chimney, window1, window2, windowLine1, windowLine2, windowLine3, windowLine4);
        
        //
        Scene scene = new Scene(root, sceneWidth, sceneHeight);
        mainStage.setScene(scene);
        mainStage.setTitle("House with Window Panes");
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}