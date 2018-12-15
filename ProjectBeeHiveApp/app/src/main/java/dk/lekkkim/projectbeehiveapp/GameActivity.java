package dk.lekkkim.projectbeehiveapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dk.lekkkim.projectbeehiveapp.model.PixelGridView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Load game
        PixelGridView pixelGridView = new PixelGridView(this);
        pixelGridView.setNumColumns(4);
        pixelGridView.setNumRows(6);

        //setContentView(R.layout.activity_game);
        setContentView(pixelGridView);
    }
}
