package com.example.android.grz_task;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.CategoryViewHolder>  {
  private Context mContext;
  private List<MainView.CategoryInfo>category;

  public CategoryRecyclerViewAdapter(Context Context,List<MainView.CategoryInfo>categoryInfos) {
        this.mContext = Context;
        this.category=categoryInfos;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.slider_view,viewGroup ,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        String name=category.get(position).getName();
        if(name!=null&&!name.isEmpty()){
            holder.nameTextView.setText(name);
        }else {
            holder.nameTextView.setText("");
        }
      String image_url=category.get(position).getPhoto();
        if(image_url!=null&&!image_url.isEmpty()){
            Uri uri=Uri.parse(image_url);
            Picasso.get().load(uri).into(holder.sliderImage);
        }else {
            holder.sliderImage.setImageResource(R.drawable.ic_launcher_background);
        }

    }

    @Override
    public int getItemCount() {
        return category.size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
      ImageView sliderImage;
      TextView nameTextView;
        private CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            sliderImage=itemView.findViewById(R.id.imageView);
            nameTextView=itemView.findViewById(R.id.textView2);
        }

    }
}
