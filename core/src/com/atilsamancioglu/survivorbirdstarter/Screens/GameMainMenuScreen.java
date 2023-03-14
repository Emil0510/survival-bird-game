package com.atilsamancioglu.survivorbirdstarter.Screens;

import com.atilsamancioglu.survivorbirdstarter.GameSurvivorBird;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Container;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameMainMenuScreen implements Screen {

    final GameSurvivorBird game;

    OrthographicCamera camera;
    private Stage stage;

    public GameMainMenuScreen(final GameSurvivorBird game) {
        this.game = game;
//
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
//        stage = new Stage(new ScreenViewport());

//        stage = new Stage(new ScreenViewport());
//        //stage.setDebugAll(true);
//
//        Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
//        Container<Table> tableContainer = new Container<Table>();
//
//        float sw = Gdx.graphics.getWidth();
//        float sh = Gdx.graphics.getHeight();
//
//        float cw = sw * 0.7f;
//        float ch = sh * 0.5f;
//
//        tableContainer.setSize(cw, ch);
//        tableContainer.setPosition((sw - cw) / 2.0f, (sh - ch) / 2.0f);
//        tableContainer.fillX();
//
//        Table table = new Table(skin);
//
//        Label topLabel = new Label("A LABEL", skin);
//        topLabel.setAlignment(Align.center);
//        Slider slider = new Slider(0, 100, 1, false, skin);
//        Label anotherLabel = new Label("ANOTHER LABEL", skin);
//        anotherLabel.setAlignment(Align.center);
//
//        CheckBox checkBoxA = new CheckBox("Checkbox Left", skin);
//        CheckBox checkBoxB = new CheckBox("Checkbox Center", skin);
//        CheckBox checkBoxC = new CheckBox("Checkbox Right", skin);
//
//        Table buttonTable = new Table(skin);
//
//        TextButton buttonA = new TextButton("LEFT", skin);
//        TextButton buttonB = new TextButton("RIGHT", skin);
//
//        table.row().colspan(3).expandX().fillX();
//        table.add(topLabel).fillX();
//        table.row().colspan(3).expandX().fillX();
//        table.add(slider).fillX();
//        table.row().colspan(3).expandX().fillX();
//        table.add(anotherLabel).fillX();
//        table.row().expandX().fillX();
//
//        table.add(checkBoxA).expandX().fillX();
//        table.add(checkBoxB).expandX().fillX();
//        table.add(checkBoxC).expandX().fillX();
//        table.row().expandX().fillX();;
//
//        table.add(buttonTable).colspan(3);
//
//        buttonTable.pad(16);
//        buttonTable.row().fillX().expandX();
//        buttonTable.add(buttonA).width(cw/3.0f);
//        buttonTable.add(buttonB).width(cw/3.0f);
//
//        tableContainer.setActor(table);
//        stage.addActor(tableContainer);
//
//        Gdx.input.setInputProcessor(stage);

    }

    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {
//        ScreenUtils.clear(0, 0, 0.2f, 1);
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


//        stage.act();
//        stage.draw();
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Welcome to Survivor Bird Game!!! ", 100, 150);
        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);

        game.batch.end();
//
        if (Gdx.input.isTouched()) {
            game.setScreen(new GameGameScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
