package tk.soulcar.acar.asc;

import android.app.Application;

public class iSoulCar extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        UsbOtg.initInstance();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }


}
