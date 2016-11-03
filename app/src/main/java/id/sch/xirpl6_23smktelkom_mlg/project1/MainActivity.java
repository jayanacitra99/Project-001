package id.sch.xirpl6_23smktelkom_mlg.project1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSUB;
    Button btnSUB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSUB = (Button) findViewById(R.id.buttonSUB);
        txtSUB = (TextView) findViewById(R.id.textViewSUB);

        findViewById(R.id.buttonSUB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doClick();
            }

            private void doClick() {

            }
        });

    }
}
