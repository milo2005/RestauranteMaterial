package unicauca.movil.restaurantesmaterial;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unicauca.movil.restaurantesmaterial.databinding.ActivityDetailBinding;
import unicauca.movil.restaurantesmaterial.models.Restaurante;
import unicauca.movil.restaurantesmaterial.util.L;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_POS = "pos";

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        int pos =  getIntent().getExtras().getInt(EXTRA_POS);
        Restaurante res = L.data.get(pos);

        binding.setRes(res);

    }
}
