package com.example.shiyan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListActivity extends AppCompatActivity {
    private List<Brand> brandList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBrand();
        BrandAdapter adapter = new BrandAdapter(ListActivity.this, R.layout.brand_item, brandList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Brand brand = brandList.get(position);
                String text = "排名:" + brand.getId() + "品牌:" + brand.getBrand() + "搜索指数:" + brand.getRank();
                Intent intent = new Intent(ListActivity.this, ItemDetailActivity.class);
                intent.putExtra("extra_text", text);
                startActivity(intent);
            }
        });

    }

    private void initBrand() {
        for (int i = 0; i < 3; i++) {
            Brand brand1 = new Brand("1", "联想", "510947");
            brandList.add(brand1);
            Brand brand2 = new Brand("2", "戴尔", "225193");
            brandList.add(brand2);
            Brand brand3 = new Brand("3", "华硕", "222513");
            brandList.add(brand3);
            Brand brand4 = new Brand("4", "苹果", "181891");
            brandList.add(brand4);
            Brand brand5 = new Brand("5", "惠普", "91470");
            brandList.add(brand5);
            Brand brand6 = new Brand("6", "宏基", "72139");
            brandList.add(brand6);
            Brand brand7 = new Brand("7", "索尼", "65158");
            brandList.add(brand7);
            Brand brand8 = new Brand("8", "三星", "52514");
            brandList.add(brand8);
            Brand brand9 = new Brand("9", "神舟", "35647");
            brandList.add(brand9);
            Brand brand10 = new Brand("10", "东芝", "20994");
            brandList.add(brand10);
        }
    }
}





