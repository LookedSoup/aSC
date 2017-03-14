package tk.soulcar.acar.asc;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

public class ActivitySpeedMeasurement extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.a_speed_measurement);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Обработайте нажатие, верните true, если обработка выполнена
        Intent intent = new Intent(this, ActivityConsult.class);
        startActivity(intent);

        return false;
    }

}
