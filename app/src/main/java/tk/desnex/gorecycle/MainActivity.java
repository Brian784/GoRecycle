package tk.desnex.gorecycle;

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

    public void gotoLevels(View v){
        Intent i=new Intent(this,LevelsActivity.class);
        startActivity(i);
    }
    public void gotoCredits(View v){
        Intent i=new Intent(this,CreditsActivity.class);
        startActivity(i);
    }


}
