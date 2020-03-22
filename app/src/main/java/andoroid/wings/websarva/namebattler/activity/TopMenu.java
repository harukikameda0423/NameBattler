package andoroid.wings.websarva.namebattler;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TopMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);

        // buttonを取得
        Button btnPlayerList = findViewById(R.id.btnPlayerList);
        Button btnMakePlayer = findViewById(R.id.btnMakePlayer);
        Button btnBattleStart = findViewById(R.id.btnBattleStart);

    }

    /**
     * リスナークラス
     */
    public void onButtonClick(View view){

        // タップされた部品のidを取得
        int id = view.getId();

        Intent intent = null;

        // idによって処理を分岐
        switch (id) {
            // キャラ作成
            case R.id.btnMakePlayer:
                intent.putExtra("viewID", R.id.btnMakePlayer);
                break;
            // キャラ一覧
            case R.id.btnPlayerList:
                intent = new Intent(TopMenu.this, PlayerListActivity.class);
                intent.putExtra("viewID", R.id.btnPlayerList);
                break;
            // バトル開始
            case R.id.btnBattleStart:
                intent.putExtra("viewID", R.id.btnBattleStart);
                break;
            case R.id.toolbar:
                finish();
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}


