package com.mushtaq.mydraganddeaw;

import androidx.fragment.app.Fragment;

public class DragAndDrawActivity extends SingleFragmentActivity {
    @Override
    public Fragment creatFragment() {
        return  DragAndDrawFragment.newInstance();
    }
}
