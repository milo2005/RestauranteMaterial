package unicauca.movil.restaurantesmaterial;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.ViewTreeObserver;

import unicauca.movil.restaurantesmaterial.databinding.ActivityDetailBinding;
import unicauca.movil.restaurantesmaterial.models.Restaurante;
import unicauca.movil.restaurantesmaterial.util.L;

public class DetailActivity extends AppCompatActivity implements  ViewTreeObserver.OnGlobalLayoutListener {

    public static final String EXTRA_POS = "pos";
    public static final int DARKEN = 20;

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        int pos =  getIntent().getExtras().getInt(EXTRA_POS);
        Restaurante res = L.data.get(pos);

        binding.setRes(res);

        binding.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(this);

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();



    }


    @Override
    public void onGlobalLayout() {
        BitmapDrawable drawable = (BitmapDrawable) binding.img.getDrawable();
        Palette p =  Palette.from(drawable.getBitmap()).generate();

        int colorDefault = ContextCompat.getColor(this, R.color.colorPrimary);
        binding.collapsingBar.setContentScrimColor(p.getLightVibrantColor(colorDefault));
    }

    private int getStatusColor(int color){
        int r, b, g;
        r = getDarkColor(Color.red(color));
        b = getDarkColor(Color.blue(color));
        g = getDarkColor(Color.green(color));
        return Color.rgb(r,g,b);
    }

    private int getDarkColor(int color){
        int c = color - DARKEN;
        if(c < 0)
            c = 0;
        return c;
    }
}
