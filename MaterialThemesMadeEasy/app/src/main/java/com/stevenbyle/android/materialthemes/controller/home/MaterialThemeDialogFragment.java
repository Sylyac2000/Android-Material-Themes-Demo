package com.stevenbyle.android.materialthemes.controller.home;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stevenbyle.android.materialthemes.BuildConfig;
import com.stevenbyle.android.materialthemes.R;
import com.stevenbyle.android.materialthemes.global.LogUtil;

/**
 * @author Steven Byle
 */
public class MaterialThemeDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private static final String TAG = LogUtil.generateTag(MaterialThemeFragment.class);

    private static final String KEY_ARG_TITLE = "KEY_ARG_TITLE";
    private static final String KEY_ARG_MESSAGE = "KEY_ARG_MESSAGE";

    private String mTitle, mMessage;

    public static MaterialThemeDialogFragment newInstance(Context context, @StringRes int titleResId, @StringRes int messageResId) {
        MaterialThemeDialogFragment fragment = newInstance(context.getString(titleResId), context.getString(messageResId));
        return fragment;
    }

    public static MaterialThemeDialogFragment newInstance(String title, String message) {
        if (BuildConfig.DEBUG) {
            LogUtil.logMethod(TAG, "newInstance");
        }

        MaterialThemeDialogFragment fragment = new MaterialThemeDialogFragment();
        Bundle args = fragment.getArguments();
        if (args == null) {
            args = new Bundle();
        }

        args.putString(KEY_ARG_TITLE, title);
        args.putString(KEY_ARG_MESSAGE, message);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnAttach(TAG);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnCreate(TAG, savedInstanceState);
        }

        // Get passed in parameters
        Bundle args = getArguments();

        // If no parameters were passed in, default them
        if (args == null) {
            mTitle = null;
            mMessage = null;
        }
        // Otherwise, set incoming parameters
        else {
            mTitle = args.getString(KEY_ARG_TITLE);
            mMessage = args.getString(KEY_ARG_MESSAGE);
        }

        // If this is the first creation, default state variables
        if (savedInstanceState == null) {
        }
        // Otherwise, restore state
        else {
        }

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (BuildConfig.DEBUG) {
            LogUtil.logOnCreateDialog(TAG, savedInstanceState);
        }

        Activity parentActivity = getActivity();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(parentActivity)
                .setTitle(mTitle)
                .setMessage(mMessage)
                .setPositiveButton(R.string.dialog_button_positive, this)
                .setNegativeButton(R.string.dialog_button_negative, this);

        Dialog dialog = alertDialogBuilder.create();
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (BuildConfig.DEBUG) {
            LogUtil.logOnCreateView(TAG, savedInstanceState);
        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnViewCreated(TAG, savedInstanceState);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnActivityCreated(TAG, savedInstanceState);
        }
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnViewStateRestored(TAG, savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnStart(TAG);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnResume(TAG);
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnPause(TAG);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (BuildConfig.DEBUG) {
            LogUtil.logOnSaveInstanceState(TAG);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnStop(TAG);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnDestroyView(TAG);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (BuildConfig.DEBUG) {
            LogUtil.logOnDestroy(TAG);
        }
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        // TODO

    }

}