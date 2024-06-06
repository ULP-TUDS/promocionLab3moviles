    package com.miapp.asistencia;

    import android.os.Bundle;
    import android.view.View;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;
    import androidx.lifecycle.ViewModelProvider;

    import com.miapp.asistencia.databinding.ActivityMainBinding;

    public class MainActivity extends AppCompatActivity {
        private MainActivityViewModel vm;
        private ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            vm = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(MainActivityViewModel.class);

            binding.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = binding.etemail.getText().toString();
                    String password = binding.etpassword.getText().toString();
                    String rol = binding.etspinner.getSelectedItem().toString();
                    vm.logueo(email, password, rol);
                }
            });
        }
    }