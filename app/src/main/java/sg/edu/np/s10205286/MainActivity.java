package sg.edu.np.s10205286;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Boolean user_followed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.username);
        name.setText(R.string.myName);

        TextView desc = findViewById(R.id.user_description);
        desc.setText(R.string.myDesc);

        Button fllw_btn = findViewById(R.id.follow_btn);
        fllw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user_followed) {
                    user_followed = false;
                    fllw_btn.setText("Follow");
                }
                else {
                    user_followed = true;
                    fllw_btn.setText("Unfollow");
                }
            }
        });


        Log.d("debug", "create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "restart");
    }
}