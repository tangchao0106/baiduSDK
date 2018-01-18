package baidumapsdk.demo;

import android.app.Application;
import android.util.Log;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

import static com.baidu.location.h.j.L;


public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 在使用 SDK 各组间之前初始化 cntext 信息，传入 ApplicationContext
        Log.d("cs", "1");
        try {
                    SDKInitializer.initialize(this);

//            SDKInitializer.initialize(getApplicationContext());
        } catch (Exception e) {
            Log.d("cs", "ee=" + e.getMessage());
        }

        Log.d("cs", "2");

//        //自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
//        //包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
        SDKInitializer.setCoordType(CoordType.BD09LL);
        Log.d("cs", "3");

    }
}