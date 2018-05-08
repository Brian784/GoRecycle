package tk.desnex.gorecycle;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private Intent i;
    private int [] PictureIds;
    private String[] answers;
    private ImageView given;
    private Button bio,recy,non_bio,next;
    private int ctr=0;
    private String Currentanswer;
    private Drawable defaultColor;
    private int score=0;
    private TextView socreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        given=(ImageView)findViewById(R.id.img_picture);
        bio=(Button)findViewById(R.id.btn_game_1);
        recy=(Button)findViewById(R.id.btn_game_2);
        non_bio=(Button)findViewById(R.id.btn_game_3);
        next=(Button)findViewById(R.id.btn_game_next);
        socreView=(TextView)findViewById(R.id.txt_score);
        socreView.setText("Score : "+score);
        next.setVisibility(View.INVISIBLE);
        next.setEnabled(false);
        defaultColor=(Drawable)bio.getBackground();
        i=getIntent();
        PictureIds=i.getIntArrayExtra("pictures");
        answers=i.getStringArrayExtra("answers");
        given.setImageResource(PictureIds[ctr]);



    }
    public void clickedNext(View v) {
        ++ctr;
        if (ctr<PictureIds.length) {

            given.setImageResource(PictureIds[ctr]);
            next.setVisibility(View.INVISIBLE);

            non_bio.setBackgroundResource(android.R.drawable.btn_default);
            bio.setBackgroundResource(android.R.drawable.btn_default);
            recy.setBackgroundResource(android.R.drawable.btn_default);
            bio.setEnabled(true);
            non_bio.setEnabled(true);
            recy.setEnabled(true);
        }else{
            Intent back=new Intent(this,LevelsActivity.class);
            startActivity(back);
        }
    }
    public void setNonbioAnswer(View v){
        Currentanswer="NB";
        if (Currentanswer.equals(answers[ctr])){
            non_bio.setBackgroundColor(Color.GREEN);
            ++score;
            socreView.setText("Score : "+score);
        }else{
            non_bio.setBackgroundColor(Color.RED);
            if(answers[ctr].equals("R")){
                recy.setBackgroundColor(Color.GREEN);
            }else{
                bio.setBackgroundColor(Color.GREEN);
            }
        }
        bio.setEnabled(false);
        recy.setEnabled(false);
        next.setVisibility(View.VISIBLE);
        next.setEnabled(true);
    }
    public void setbioAnswer(View v){
        Currentanswer="B";
        if (Currentanswer.equals(answers[ctr])){
                bio.setBackgroundColor(Color.GREEN);
            ++score;
            socreView.setText("Score : "+score);
        }else{
            bio.setBackgroundColor(Color.RED);
            if(answers[ctr].equals("NB")){
                non_bio.setBackgroundColor(Color.GREEN);
            }else{
                recy.setBackgroundColor(Color.GREEN);
            }
        }
        non_bio.setEnabled(false);
        recy.setEnabled(false);
        next.setVisibility(View.VISIBLE);
        next.setEnabled(true);
    }
    public void setRecycleAnswer(View v){
        Currentanswer="R";
        if (Currentanswer.equals(answers[ctr])){
                recy.setBackgroundColor(Color.GREEN);
            ++score;
            socreView.setText("Score : "+score);
        }else{
                recy.setBackgroundColor(Color.RED);
                if(answers[ctr].equals("NB")){
                    non_bio.setBackgroundColor(Color.GREEN);
                }else{
                    bio.setBackgroundColor(Color.GREEN);
                }
        }
        non_bio.setEnabled(false);
        bio.setEnabled(false);
        next.setVisibility(View.VISIBLE);
        next.setEnabled(true);
    }



}
