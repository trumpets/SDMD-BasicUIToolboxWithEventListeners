package gr.academic.city.sdmd.basicuitoolboxwitheventlisteners;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.msg_toast, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_hello).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hello) {
            EditText nameInput = (EditText) findViewById(R.id.txt_name);
            TextView greetingTextView = (TextView) findViewById(R.id.tv_greeting);
            greetingTextView.setText("Hello " + nameInput.getText().toString());
        }
    }
}
