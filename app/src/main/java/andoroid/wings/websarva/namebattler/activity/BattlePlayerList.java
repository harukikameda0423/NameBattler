package andoroid.wings.websarva.namebattler.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import andoroid.wings.websarva.namebattler.R;

public class BattleMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // actionbarを取得
        ActionBar actionBar = getSupportActionBar();
        // アクションバーの戻るメニューを有効
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
