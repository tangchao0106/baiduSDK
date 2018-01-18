package baidumapsdk.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;

/**
 * 类描述:
 * 创建人:   tangchao
 * 创建时间:  2018/1/18 16:13
 * 联系方式:419704299@qq.com
 * 修改人:    tangchao
 * 修改时间: 2018/1/18 16:13
 * 修改备注:  [说明本次修改内容]
 */
public class Test1 extends Activity {
    private TextView tvtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aa);
        initView();

        LatLng locationLatLng = new LatLng(32.169378, 118.710009);

        //
// 将google地图、soso地图、aliyun地图、mapabc地图和amap地图// 所用坐标转换成百度坐标
        com.baidu.mapapi.utils.CoordinateConverter converter = new CoordinateConverter();
        converter.from(CoordinateConverter.CoordType.COMMON);
// sourceLatLng待转换坐标
        converter.coord(locationLatLng);
        com.baidu.mapapi.model.LatLng desBaiduStartLatLng = converter.convert();
        tvtest.setText(desBaiduStartLatLng.latitude+"==="+desBaiduStartLatLng.longitude);

    }

    private void initView() {
        tvtest = (TextView) findViewById(R.id.tvtest);
    }
}
