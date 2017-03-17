package tk.soulcar.acar.asc;

public class UsbOtg {

    private static UsbOtg mInstance;

    public static void initInstance() {
        if (mInstance == null) {

            mInstance = new UsbOtg();

        }
    }

}
