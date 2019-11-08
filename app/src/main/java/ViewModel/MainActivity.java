package ViewModel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.eregulator.R;

import java.util.List;

import Model.Geraet;
import Model.User;
import Model.UserStore;

public class MainActivity extends AppCompatActivity {

    private UserViewModel viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        setupButton();
    }


    @Override
    protected void onResume() {
        super.onResume();
        displayAllKnownUsers();
    }

    public void setupButton(){
        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.addUser("Gernez Moudiyo", "Gernez","gernezsorel@yahoo.fr","MOUDIYO");
            }
        });
    }

    private void displayAllKnownUsers() {
        viewModel.getUsers().observe(this, new Observer<List<User>>(){
            @Override
            public void onChanged(List<User> users) {
                renderAllUsers(users);
            }


        });
    }





    //really simple - you should use a RecycleView in production instead
    private void renderAllUsers(List<User> users){
        LinearLayout container = findViewById(R.id.very_basic_container);
        container.removeAllViews();
        for (User u : users){
            container.addView(getUserTextView(u));
        }
    }

    private TextView getUserTextView(User u){
        TextView textView = new TextView(MainActivity.this);
        textView.setText(u.getFullname() + "(" + u.getUsername() + ")+ (" + u.getEmail() + ")+ ("+ u.getPassword() +")\n");
        return textView;
    }
}

