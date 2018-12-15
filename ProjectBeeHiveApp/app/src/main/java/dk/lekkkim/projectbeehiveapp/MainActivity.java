package dk.lekkkim.projectbeehiveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when exit_button is pressed.
     * Closes the application. */
    public void exitAction(View view){
        System.exit(0);
    }

    /** Called when start_button is pressed.
     * Contiues to the game screen. */
    public void startAction(View view){
        startActivity(new Intent(this, GameActivity.class));
    }
}
