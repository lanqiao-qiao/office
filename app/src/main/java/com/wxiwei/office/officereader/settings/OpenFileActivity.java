package com.wxiwei.office.officereader.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.wxiwei.office.constant.MainConstant;
import com.wxiwei.office.officereader.AppActivity;
import com.wxiwei.office.officereader.R;

public class OpenFileActivity extends Activity
{
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_file_activity);

        context = this;

        Button b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(context, AppActivity.class);
                intent.putExtra(MainConstant.INTENT_FILED_FILE_PATH, "/storage/emulated/0/DOC.doc");
//                Log.d("LanAbsolutePath","FileListActivity browseTo else:  "+aDirectory.getAbsolutePath());
                startActivityForResult(intent, RESULT_FIRST_USER);
            }
        });

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(context, AppActivity.class);
                intent.putExtra(MainConstant.INTENT_FILED_FILE_PATH, "/storage/emulated/0/TXT.txt");
//                Log.d("LanAbsolutePath","FileListActivity browseTo else:  "+aDirectory.getAbsolutePath());
                startActivityForResult(intent, RESULT_FIRST_USER);
            }
        });

        Button b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(context, AppActivity.class);
                intent.putExtra(MainConstant.INTENT_FILED_FILE_PATH, "/storage/emulated/0/EXCEL.xlsx");
//                Log.d("LanAbsolutePath","FileListActivity browseTo else:  "+aDirectory.getAbsolutePath());
                startActivityForResult(intent, RESULT_FIRST_USER);
            }
        });

        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(context, AppActivity.class);
                intent.putExtra(MainConstant.INTENT_FILED_FILE_PATH, "/storage/emulated/0/PPT.pptx");
//                Log.d("LanAbsolutePath","FileListActivity browseTo else:  "+aDirectory.getAbsolutePath());
                startActivityForResult(intent, RESULT_FIRST_USER);
            }
        });
    }
}
