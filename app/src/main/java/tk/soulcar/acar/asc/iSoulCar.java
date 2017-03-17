package tk.soulcar.acar.asc;

import android.app.Application;
import android.widget.Toast;

import com.physicaloid.lib.Physicaloid;
import com.physicaloid.lib.usb.driver.uart.ReadLisener;

public class iSoulCar extends Application {

    public static Physicaloid mPhysicaloid; // initialising library
    public static boolean connectUsbOtg;

    @Override
    public void onCreate() {
        super.onCreate();

        mPhysicaloid = new Physicaloid(this);
        if(mPhysicaloid.open()) {

            connectUsbOtg = true;

            mPhysicaloid.setBaudrate(19200);
            mPhysicaloid.addReadListener(new ReadLisener() {
                @Override
                public void onRead(int size) {
                    byte[] buf = new byte[size];
                    mPhysicaloid.read(buf, size);
                    //tvAppend(tvRead, Html.fromHtml("<font color=blue>" + new String(buf) + "</font>"));
                }
            });
        } else {
            connectUsbOtg = false;

            Toast.makeText(this, "Cannot connect monitor-host", Toast.LENGTH_LONG).show();
        }
        UsbOtg.initInstance();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        if(mPhysicaloid.close()) {
            mPhysicaloid.clearReadListener();
        }
    }

}
