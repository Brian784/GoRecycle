package tk.desnex.gorecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelsActivity extends AppCompatActivity {
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels2);
    }
    public void gotoGame(View v){
        i=new Intent(this,GameActivity.class);
        switch (v.getId()){

            case R.id.button1:
                i.putExtra("pictures",Levels.LV1_Pictures);
                i.putExtra("answers",Levels.LV1_answer);
                break;
            case R.id.button2:
                i.putExtra("pictures",Levels.LV2_Pictures);
                i.putExtra("answers",Levels.LV2_answer);
                break;
            case R.id.button3:
                i.putExtra("pictures",Levels.LV3_Pictures);
                i.putExtra("answers",Levels.LV3_answer);
                break;
            case R.id.button4:
                i.putExtra("pictures",Levels.LV4_Pictures);
                i.putExtra("answers",Levels.LV4_answer);
                break;
            case R.id.button5:
                i.putExtra("pictures",Levels.LV5_Pictures);
                i.putExtra("answers",Levels.LV5_answer);
                break;
            case R.id.button6:
                i.putExtra("pictures",Levels.LV6_Pictures);
                i.putExtra("answers",Levels.LV6_answer);
                break;
            case R.id.button7:
                i.putExtra("pictures",Levels.LV7_Pictures);
                i.putExtra("answers",Levels.LV7_answer);
                break;
            case R.id.button8:
                i.putExtra("pictures",Levels.LV8_Pictures);
                i.putExtra("answers",Levels.LV8_answer);
                break;
            case R.id.button9:
                i.putExtra("pictures",Levels.LV9_Pictures);
                i.putExtra("answers",Levels.LV9_answer);
                break;

        }
        startActivity(i);


    }

}
