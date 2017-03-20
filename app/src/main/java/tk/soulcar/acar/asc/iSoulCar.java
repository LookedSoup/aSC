package tk.soulcar.acar.asc;

import android.app.Application;
import android.widget.Toast;

import com.physicaloid.lib.Physicaloid;

public class iSoulCar extends Application {

    Physicaloid mPhysicaloid;

    @Override
    public void onCreate() {
        super.onCreate();

        mPhysicaloid = new Physicaloid(this);
        mPhysicaloid.setBaudrate(9600);

        if(mPhysicaloid.open()) {

        } else {
            Toast.makeText(this, "Cannot open", Toast.LENGTH_LONG).show();
        }

        UsbOtg.initInstance();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }


}
