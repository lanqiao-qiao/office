package com.wxiwei.office.officereader.settings;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wxiwei.office.officereader.R;

public class OpenFileActivity extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_file_activity);
    }
}
