package camerafilters.cisco.kpfu.ru.camerafilters;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;

/**
 * Created by Кель on 03.12.2014.
 */
public class CameraUtils {

    public static boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
