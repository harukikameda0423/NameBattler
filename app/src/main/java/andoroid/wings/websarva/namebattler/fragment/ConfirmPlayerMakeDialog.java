package andoroid.wings.websarva.namebattler.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import andoroid.wings.websarva.namebattler.R;


public class AlertPlayerMakeDialog extends DialogFragment {

   @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

       // ダイアログビルダー
       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

       int alertMessage = getArguments().getInt("message");

       // ダイアログの設定
       builder.setTitle(R.string.alertDialog_title);        // タイトル
       builder.setMessage(alertMessage);    // メッセージ

       // okボタンの設定
       builder.setPositiveButton(R.string.alertDialog_btn_ok, new DialogButtonClickListener());

       // ダイアログの生成
       AlertDialog dialog = builder.create();
       return dialog;
   }

   public class DialogButtonClickListener implements DialogInterface.OnClickListener {
       @Override
       public void onClick(DialogInterface dialog, int witch) {
           switch (witch) {
               case DialogInterface.BUTTON_POSITIVE:
                   break;
           }
       }
   }
}
