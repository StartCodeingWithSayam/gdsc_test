package live.sayam.gdsc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.net.URISyntaxException;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    String data;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        data = getIntent().getExtras().getString("name");
        textView = findViewById(R.id.text_View);
        textView.setText(data);
    }
}