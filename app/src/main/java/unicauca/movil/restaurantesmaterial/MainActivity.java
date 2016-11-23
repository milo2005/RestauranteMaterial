package unicauca.movil.restaurantesmaterial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import unicauca.movil.restaurantesmaterial.models.Restaurante;
import unicauca.movil.restaurantesmaterial.util.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
    }

    //region Load restaurantes
    private void loadData(){
        L.data = new ArrayList<>();

        Restaurante r1 = new Restaurante();
        r1.setNombre("Cosecha");
        r1.setDescripcion(getString(R.string.ipsum));
        r1.setDireccion("Calle 4 # 7-79");
        r1.setImagen("http://www.lacosechaparrillada.com/wp-content/uploads/2015/03/para-inicio-centro-FILEminimizer.jpg");
        r1.setTelefono("8236799");
        r1.setTipo(getString(R.string.menu_gourmet));
        r1.setCalificacion(9.7f);

        Restaurante r2 = new Restaurante();
        r2.setNombre("La Pizzara");
        r2.setDescripcion(getString(R.string.ipsum));
        r2.setDireccion("Carrera 9 #35");
        r2.setImagen("http://www.ocio.net/wp-content/uploads/2015/12/pizza-pepperoni-w857h456.jpg");
        r2.setTelefono("8311313");
        r2.setTipo(getString(R.string.menu_pizza));
        r2.setCalificacion(7.8f);

        Restaurante r3 = new Restaurante();
        r3.setNombre("Tequilas");
        r3.setDescripcion(getString(R.string.ipsum));
        r3.setDireccion("Calle 5 No. 9-25");
        r3.setImagen("http://www.donrafarestaurants.com/img/h02.jpg");
        r3.setTelefono("8222150");
        r3.setTipo(getString(R.string.menu_mexican));
        r3.setCalificacion(8.5f);

        Restaurante r4 = new Restaurante();
        r4.setNombre("Bananos");
        r4.setDescripcion(getString(R.string.ipsum));
        r4.setDireccion("Calle 17 Norte #7AN 61");
        r4.setImagen("http://www.popayanmas.co/sites/default/files/styles/op_prin_w520_h350/public/operadores-turisticos/reataurantebananas.jpg");
        r4.setTelefono("8234306");
        r4.setTipo(getString(R.string.menu_meet));
        r4.setCalificacion(9.2f);

        Restaurante r5 = new Restaurante();
        r5.setNombre("Juan Valdes");
        r5.setDescripcion(getString(R.string.ipsum));
        r5.setDireccion("Carrera 7 Centro");
        r5.setImagen("http://www.juanvaldezcafe.com/sites/default/files/PRODUCTOS-TEMPORADA-NAVIDAD.jpg");
        r5.setTelefono("");
        r5.setTipo(getString(R.string.menu_coffee));
        r5.setCalificacion(9.5f);

        Restaurante r6 = new Restaurante();
        r6.setNombre("Carantanta");
        r6.setDescripcion(getString(R.string.ipsum));
        r6.setDireccion("Av. Panamericana");
        r6.setImagen("https://i.ytimg.com/vi/8HnNzbHGQ74/maxresdefault.jpg");
        r6.setTelefono("8367977");
        r6.setTipo(getString(R.string.menu_gourmet));
        r6.setCalificacion(9.7f);

        L.data.add(r1);
        L.data.add(r2);
        L.data.add(r3);
        L.data.add(r4);
        L.data.add(r5);
        L.data.add(r6);

    }
    //endregion
}
