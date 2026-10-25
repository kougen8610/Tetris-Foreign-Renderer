package tetris;

import javafx.application.Application;
import tetris.utils.SDL;

public class Start {
    public static final RendererType rendererType = RendererType.SDL3;

    public static void main(String[] args) {
        if (rendererType == RendererType.JavaFX) {
            Application.launch(App.class, args);
        }
        else if (rendererType == RendererType.SDL3) {
            SDLApp app = new SDLApp();
            app.start();
        }
    }
}

enum RendererType {
    JavaFX, SDL3
}