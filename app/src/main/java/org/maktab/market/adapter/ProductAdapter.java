package org.maktab.market.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.maktab.market.R;
import org.maktab.market.databinding.ListItemProductBinding;
import org.maktab.market.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    private List<Product> mItems;
    private Context mContext;

    public List<Product> getItems() {
        return mItems;
    }

    public void setItems(List<Product> items) {
        mItems = items;
    }

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context context) {
        mContext = context;
    }

    public ProductAdapter(Context context, List<Product> items) {
        mContext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemProductBinding listItemProductBinding =
                DataBindingUtil.inflate(LayoutInflater.from(mContext),
                        R.layout.list_item_product,
                        parent,
                        false);
        return new ProductHolder(listItemProductBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

        holder.bindProductItem(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ProductHolder extends RecyclerView.ViewHolder{

        private ListItemProductBinding mBinding;

        public ProductHolder(@NonNull ListItemProductBinding binding) {
            super(binding.getRoot());
            mBinding = binding;

        }

        private void bindProductItem(Product product){

            Picasso.get()
                    .load(product.getUrl())
                    .into(mBinding.itemImageProduct);
        }
    }
}
