package com.bignerdranch.android.runtracker;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class RunActivity extends SingleFragmentActivity {

    /**
     * A key for passing a run ID As a long
     */
    public static final String EXTRA_RUN_ID = "com.bignerdranch.android.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunFragment.newInstance(runId);
        }
        return new RunFragment();
    }
}
