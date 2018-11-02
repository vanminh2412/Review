package com.product.review.revier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.product.review.revier.adapter.SearchAdapter;
import com.product.review.revier.model.Product;

import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private RecyclerView rcvSearch;
    private Toolbar toolbar;
    private ImageView imvBack;
    private EditText edtSearch;
    private TextView tvResult,tvAddnew;
    private SearchAdapter adapter;
    private List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        init();

        //set layout recycleview
        rcvSearch.setLayoutManager(new LinearLayoutManager(this));
        Product product = new Product(1,"IPhoneX",4.3,R.drawable.ic_search,R.drawable.ic_starvote,R.drawable.ic_starvote,R.drawable.ic_starvote,R.drawable.ic_starvote,R.drawable.ic_star);
        productList.add(product);
        //set adapter
        adapter = new SearchAdapter(this,productList);
        rcvSearch.setAdapter(adapter);
    }

    //ánh xạ
    private void init() {
        rcvSearch = findViewById(R.id.rcv_search);
        rcvSearch.setHasFixedSize(true);
        toolbar = findViewById(R.id.toolbar);
        imvBack = findViewById(R.id.imv_back);
        edtSearch = findViewById(R.id.edt_search);
        tvAddnew = findViewById(R.id.tv_addnew);
        tvResult = findViewById(R.id.tv_resultnull);
    }


}
