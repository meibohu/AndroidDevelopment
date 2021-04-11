package mbh.com.hutodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mbh.com.hutodolist.ui.main.ToDoListFragment;

public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_do_list_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ToDoListFragment.newInstance())
                    .commitNow();
        }
    }
}