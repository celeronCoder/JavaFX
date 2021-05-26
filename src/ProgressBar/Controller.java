package ProgressBar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;


public class Controller {
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressIndicator;

    private double progress = 0.0;

    public void increaseProgress(ActionEvent event) {
        if (progress < 1.00) {
            progress += 0.10;
            progressIndicator.setText("Progress: " + progress * 100 + "%");
            progressBar.setProgress(progress);
        } else {
            progress = 0.0;
            progressIndicator.setText("Progress: 0%");
            progressBar.setProgress(0.0);
        }
    }
}
