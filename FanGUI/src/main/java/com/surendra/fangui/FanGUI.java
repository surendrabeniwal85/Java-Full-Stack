package com.surendra.fangui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;

public class FanGUI extends Application {

    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage stage) {

        // Get video from resources
        URL videoURL = getClass().getResource("/fan.mp4");

        if (videoURL == null) {
            System.out.println("Video not found!");
            return;
        }

        // Create Media
        Media media = new Media(videoURL.toExternalForm());

        // Create MediaPlayer
        mediaPlayer = new MediaPlayer(media);

        // Create MediaView
        MediaView mediaView = new MediaView(mediaPlayer);

        mediaView.setFitWidth(900);
        mediaView.setFitHeight(500);
        mediaView.setPreserveRatio(true);

        // =========================
        // PLAY BUTTON
        // =========================

        Button playButton = new Button("▶ Play");

        playButton.setOnAction(e -> mediaPlayer.play());

        // =========================
        // PAUSE BUTTON
        // =========================

        Button pauseButton = new Button("⏸ Pause");

        pauseButton.setOnAction(e -> mediaPlayer.pause());

        // =========================
        // STOP BUTTON
        // =========================

        Button stopButton = new Button("⏹ Stop");

        stopButton.setOnAction(e -> mediaPlayer.stop());

        // =========================
        // PROGRESS SLIDER
        // =========================

        Slider progressSlider = new Slider();

        progressSlider.setMin(0);
        progressSlider.setMax(100);
        progressSlider.setPrefWidth(500);

        // Update slider while video is playing
        mediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) -> {

            if (!progressSlider.isValueChanging()) {

                Duration total = mediaPlayer.getTotalDuration();

                if (total != null && total.toMillis() > 0) {

                    double progress =
                            newTime.toMillis() / total.toMillis() * 100;

                    progressSlider.setValue(progress);
                }
            }
        });

        // Seek video when slider is moved
        progressSlider.setOnMouseReleased(e -> {

            Duration total = mediaPlayer.getTotalDuration();

            if (total != null && total.toMillis() > 0) {

                double position =
                        progressSlider.getValue() / 100;

                mediaPlayer.seek(
                        total.multiply(position)
                );
            }
        });

        // =========================
        // VOLUME SLIDER
        // =========================

        Label volumeLabel = new Label("Volume");

        Slider volumeSlider = new Slider();

        volumeSlider.setMin(0);
        volumeSlider.setMax(1);
        volumeSlider.setValue(0.5);
        volumeSlider.setPrefWidth(120);

        mediaPlayer.setVolume(0.5);

        volumeSlider.valueProperty().addListener(
                (obs, oldValue, newValue) ->
                        mediaPlayer.setVolume(newValue.doubleValue())
        );

        // =========================
        // TIME LABEL
        // =========================

        Label timeLabel = new Label("00:00 / 00:00");

        mediaPlayer.currentTimeProperty().addListener(
                (obs, oldTime, newTime) -> {

                    Duration total = mediaPlayer.getTotalDuration();

                    if (total != null && !total.isUnknown()) {

                        timeLabel.setText(
                                formatTime(newTime)
                                        + " / "
                                        + formatTime(total)
                        );
                    }
                }
        );

        // =========================
        // CONTROL BAR
        // =========================

        HBox controls = new HBox(
                10,
                playButton,
                pauseButton,
                stopButton,
                progressSlider,
                timeLabel,
                volumeLabel,
                volumeSlider
        );

        controls.setAlignment(Pos.CENTER);
        controls.setPadding(
                new javafx.geometry.Insets(10)
        );

        // =========================
        // VIDEO AREA
        // =========================

        StackPane videoPane = new StackPane();

        videoPane.getChildren().add(mediaView);

        // =========================
        // MAIN LAYOUT
        // =========================

        BorderPane root = new BorderPane();

        root.setCenter(videoPane);
        root.setBottom(controls);

        // =========================
        // SCENE
        // =========================

        Scene scene = new Scene(
                root,
                1000,
                650
        );

        stage.setTitle("Fan GUI Video Player");

        stage.setScene(scene);

        stage.show();

        // Start video automatically
        mediaPlayer.play();
    }

    // =========================
    // FORMAT TIME
    // =========================

    private String formatTime(Duration duration) {

        if (duration == null || duration.isUnknown()) {
            return "00:00";
        }

        int totalSeconds =
                (int) Math.floor(duration.toSeconds());

        int minutes = totalSeconds / 60;

        int seconds = totalSeconds % 60;

        return String.format(
                "%02d:%02d",
                minutes,
                seconds
        );
    }

    // =========================
    // STOP MEDIA PLAYER
    // =========================

    @Override
    public void stop() {

        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        launch(args);
    }
}