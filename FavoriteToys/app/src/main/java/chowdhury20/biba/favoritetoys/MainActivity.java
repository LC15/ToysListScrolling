package chowdhury20.biba.favoritetoys;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ToyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToyList=(TextView) findViewById(R.id.favorite_toy_list);
        String [] FavToyArray= ToyBox.getToyNames();
        int i=250;
        for (String toyName:FavToyArray){
            ToyList.append( toyName+ "\n");
        }
    }
}
