package com.example.android.grz_task;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ProducutViewRecyclerViewAdapter extends RecyclerView.Adapter<ProducutViewRecyclerViewAdapter.productVewHolder> {

private Context mContext;
private List<MainView.ProductRateInfo>productRate;
    public ProducutViewRecyclerViewAdapter(Context mContext,List<MainView.ProductRateInfo>productRateInfos) {
        this.mContext = mContext;
        this.productRate=productRateInfos;
    }

    @NonNull
    @Override
    public productVewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.productview,viewGroup ,false);
        return new productVewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productVewHolder holder, int position) {
      String image_url=productRate.get(position).getProduct().getProductphotos().get(0).getPhoto();
      if(image_url!=null&&!image_url.isEmpty()){
          Uri uri=Uri.parse(image_url);
          Picasso.get().load(uri).into(holder.imageProduct);
      }else {
          holder.imageProduct.setImageResource(R.drawable.ic_launcher_background);
      }
      String description=productRate.get(position).getProduct().getDescription();
      if(description!=null&&!description.isEmpty()){
          holder.textDescription.setText(description);
      }else {
          holder.textDescription.setText("");
      }
      int price=productRate.get(position).getStart_price();
      if(String.valueOf(price)!=null&&!String.valueOf(price).isEmpty()){
          holder.priceTextView.setText(String.valueOf(price));
      }else {
          holder.priceTextView.setText("5");
      }
      if (productRate.get(position).getProduct().getTotal_rating().size()>0){
          int stars = productRate.get(position).getProduct().getTotal_rating().get(0).getStars();
          holder.ratingBar.setNumStars(stars);
      }else {
          holder.ratingBar.setNumStars(0);
      }
      if (productRate.get(position).getProduct().getTotal_rating().size()>0) {
          int ratingValue = productRate.get(position).getProduct().getTotal_rating().get(0).getCount();

          holder.ratingvalue.setText(String.valueOf(ratingValue));
      }else {
          holder.ratingvalue.setText("0");
      }
    }

    @Override
    public int getItemCount() {
        return productRate.size();
    }

    class productVewHolder extends RecyclerView.ViewHolder{
       ImageView imageProduct;
       TextView textDescription;
       TextView priceTextView;
      RatingBar ratingBar;
      TextView  ratingvalue;

        public productVewHolder(@NonNull View itemView) {
            super(itemView);
            imageProduct=itemView.findViewById(R.id.image_product);
            textDescription=itemView.findViewById(R.id.text_description);
            priceTextView=itemView.findViewById(R.id.textView_price);
            ratingBar=itemView.findViewById(R.id.ratingBar);
            ratingvalue=itemView.findViewById(R.id.textView3);
        }
    }
}