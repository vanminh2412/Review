package com.product.review.revier.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.product.review.revier.R;
import com.product.review.revier.model.Product;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {

    private Context sCtx;
    private List<Product> productList;

    public SearchAdapter(Context sCtx, List<Product> productList) {
        this.sCtx = sCtx;
        this.productList = productList;
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(sCtx);
        View view = inflater.inflate(R.layout.item_search_result, null);
        SearchViewHolder holder = new SearchViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.tvProductName.setText(product.getProducName());
        holder.tvRating.setText(String.valueOf(product.getRating()));
        holder.imageProduct.setImageDrawable(sCtx.getResources().getDrawable(product.getImgproduct()));
        holder.imvVote1.setImageDrawable(sCtx.getResources().getDrawable(product.getImgvote1()));
        holder.imvVote2.setImageDrawable(sCtx.getResources().getDrawable(product.getImgvote2()));
        holder.imvVote3.setImageDrawable(sCtx.getResources().getDrawable(product.getImgvote3()));
        holder.imvVote4.setImageDrawable(sCtx.getResources().getDrawable(product.getImgvote4()));
        holder.imvVote5.setImageDrawable(sCtx.getResources().getDrawable(product.getImgvote5()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class SearchViewHolder extends RecyclerView.ViewHolder{

        ImageView imageProduct,imvVote1,imvVote2,imvVote3,imvVote4,imvVote5;
        TextView tvProductName,tvRating;
        public SearchViewHolder(View itemView) {
            super(itemView);
            imageProduct = itemView.findViewById(R.id.img_product);
            imvVote1 = itemView.findViewById(R.id.imv_vote1);
            imvVote2 = itemView.findViewById(R.id.imv_vote2);
            imvVote3 = itemView.findViewById(R.id.imv_vote3);
            imvVote4 = itemView.findViewById(R.id.imv_vote4);
            imvVote5 = itemView.findViewById(R.id.imv_vote5);
            tvProductName = itemView.findViewById(R.id.tv_productName);
            tvRating = itemView.findViewById(R.id.tv_rating);
        }
    }
}
