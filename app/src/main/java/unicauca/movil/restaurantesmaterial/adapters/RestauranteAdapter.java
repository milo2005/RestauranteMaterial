package unicauca.movil.restaurantesmaterial.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import unicauca.movil.restaurantesmaterial.R;
import unicauca.movil.restaurantesmaterial.databinding.TemplateRestauranteBinding;
import unicauca.movil.restaurantesmaterial.util.L;

/**
 * Created by Dario Chamorro on 22/11/2016.
 */

public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder> {

    LayoutInflater inflater;

    public RestauranteAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public RestauranteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = inflater.inflate(R.layout.template_restaurante, parent, false);
        RestauranteViewHolder holder = new RestauranteViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RestauranteViewHolder holder, int position) {
        holder.binding.setRes(L.data.get(position));
    }

    @Override
    public int getItemCount() {
        return L.data.size();
    }

    //Retorna el tipo de view o Celda
    /*@Override
    public int getItemViewType(int position) { return 0;}*/

    public static class RestauranteViewHolder extends RecyclerView.ViewHolder{

        TemplateRestauranteBinding binding;

        public RestauranteViewHolder(View itemView) {
            super(itemView);

            binding = DataBindingUtil.bind(itemView);

        }
    }
}
