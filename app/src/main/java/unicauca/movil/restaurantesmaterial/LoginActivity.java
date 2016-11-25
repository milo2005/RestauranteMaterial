package unicauca.movil.restaurantesmaterial;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import unicauca.movil.restaurantesmaterial.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setHandler(this);


    }

    public void goToMain(){
        String usr =  binding.usr.getEditText().getText().toString();
        String pass =  binding.pass.getEditText().getText().toString();

        Log.i("Restaurante", "Usr:"+usr+" Pass:"+pass);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
